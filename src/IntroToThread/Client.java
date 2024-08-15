package IntroToThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Value v = new Value(0);

        ExecutorService es = Executors.newCachedThreadPool();

        Adder adder = new Adder(v, es);
//        Subtractor subtractor = new Subtractor(v, es);
        Multiplier multiplier = new Multiplier(v, es);

        es.submit(adder);
//        es.submit(subtractor);
        es.submit(multiplier);
    }
}
