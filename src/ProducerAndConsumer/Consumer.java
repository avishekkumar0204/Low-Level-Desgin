package ProducerAndConsumer;

public class Consumer implements Runnable{
    Store store;
    Consumer(Store store){
        this.store = store;
    }

    public void run(){
        while(true){
            if (this.store.getItems().size() > 0) {
                this.store.removeItems();
            }
        }
    }
}
