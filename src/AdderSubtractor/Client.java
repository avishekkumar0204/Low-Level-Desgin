package AdderSubtractor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {
        Value v = new Value(0);

        ExecutorService es = Executors.newFixedThreadPool(5);

        Adder adder = new Adder(v);
        Subtractor subtractor = new Subtractor(v);

        es.submit(adder);
        es.submit(subtractor);
    }
}
