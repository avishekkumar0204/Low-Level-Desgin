package Concurrency.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        // Cached Thread pool creates new thread if all other thread are busy executing task.
        ExecutorService es = Executors.newCachedThreadPool();

        for(int i = 1; i <= 10000; i++){
            NumberPrinter np = new NumberPrinter(i);
            es.execute(np);
        }
    }
}
