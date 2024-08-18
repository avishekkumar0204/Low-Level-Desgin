package ProducerAndConsumer;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Store store;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    Producer(Store st, Semaphore producerSemaphore, Semaphore consumerSemaphore){
        this.store = st;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    public void run(){
        while(true){
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.store.addItems();
            consumerSemaphore.release();
        }
    }
}
