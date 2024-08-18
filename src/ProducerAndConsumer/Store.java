package ProducerAndConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;
    private List<Object> items;

    Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public List<Object> getItems(){
        return this.items;
    }

    public void addItems(){
        System.out.println("Producer producing item, current size::" + this.items.size());
        this.items.add(new Object());
//        System.out.println(" Producer after producing item, current size::" + this.items.size());
    }

    public void removeItems(){
        System.out.println("Consumer consuming item, current size::" + this.items.size());
        this.items.remove(this.items.size()-1);
//        System.out.println(" Consumer after consuming item, current size::" + this.items.size());
    }
}
