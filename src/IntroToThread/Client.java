package IntroToThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Value v = new Value(0);
        Lock lock = new ReentrantLock();
        ExecutorService es = Executors.newCachedThreadPool();

        Adder adder = new Adder(v, es, lock);
        Subtractor subtractor = new Subtractor(v, es, lock);
        Multiplier multiplier = new Multiplier(v, es, lock);

        es.submit(adder);
        es.submit(subtractor);
        es.submit(multiplier);
    }
}
