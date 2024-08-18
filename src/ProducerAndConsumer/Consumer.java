package ProducerAndConsumer;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    Store store;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    Consumer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore){
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    public void run(){
        while(true){
            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.store.removeItems();
            producerSemaphore.release();
        }
    }
}
