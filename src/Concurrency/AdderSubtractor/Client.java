package Concurrency.AdderSubtractor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {
        Value v = new Value(0);
        ExecutorService es = Executors.newCachedThreadPool();
        int upto = 100;
        Adder add = new Adder(v, upto);
        Subtractor sub = new Subtractor(v, upto);

       es.execute(add);
       es.execute(sub);


        System.out.println(v.getVal());

    }
}
