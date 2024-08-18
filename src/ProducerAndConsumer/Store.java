package ProducerAndConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private int maxSize;
    private ConcurrentLinkedQueue<Object> items;

    Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedQueue<>();
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public ConcurrentLinkedQueue<Object> getItems(){
        return this.items;
    }

    public void addItems(){
        System.out.println("Producer producing item, current size::" + this.items.size());
        this.items.add(new Object());
    }

    public void removeItems(){
        System.out.println("Consumer consuming item, current size::" + this.items.size());
        this.items.remove();
    }
}
