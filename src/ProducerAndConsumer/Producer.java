package ProducerAndConsumer;

public class Producer implements Runnable{
    Store store;
    Producer(Store st){
        this.store = st;
    }
    public void run(){
        while(true){
            // After applying lock only one thread of Producer or consumer will be able
            // to enter to store to produce or consume item even if more than one shelf is empty/ more
            // than 1 item is present.
            // Ideally 5 threads should be allowed to enter to store to produce and
            // consume item parallelly.
            synchronized(store) {
                if (this.store.getItems().size() < store.getMaxSize()) {
                    this.store.addItems();
                }
            }
        }
    }
}
