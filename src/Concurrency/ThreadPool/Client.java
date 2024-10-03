package Concurrency.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(8);

        for(int i = 1; i <= 10000; i++){
            NumberPrinter np = new NumberPrinter(i);
            es.execute(np);
        }
    }
}
