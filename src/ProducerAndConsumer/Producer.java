package ProducerAndConsumer;

public class Producer implements Runnable{
    Store store;
    Producer(Store st){
        this.store = st;
    }
    public void run(){
        while(true){
            if (this.store.getItems().size() < store.getMaxSize()) {
                this.store.addItems();
            }
        }
    }
}
