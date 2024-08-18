package ProducerAndConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);
        ExecutorService es = Executors.newCachedThreadPool();

        // 8 Thread for producer will be created
        for(int i = 0; i < 8; i++){
            es.execute(new Producer(store));
        }
        // 20 threads for consumer will be created
        for(int i = 0; i < 20; i++){
            es.execute(new Consumer(store));
        }
    }
}
