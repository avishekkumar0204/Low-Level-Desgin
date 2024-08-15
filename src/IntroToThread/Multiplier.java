package IntroToThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Lock;

public class Multiplier implements Callable<Void> {
    Value value;
    ExecutorService es;
    Lock lock;
    Multiplier(Value v, ExecutorService es, Lock lock) {
        this.value = v;
        this.es = es;
        this.lock = lock;
    }

    public Void call() {
        for(int i = 1; i <= 10; i++){
            synchronized (value) {
                System.out.print(this.value.val + " * " + i + " = ");
                this.value.val *= i;
                System.out.println(this.value.val + " " + Thread.currentThread().getName());
            }
        }
        return null;
    }
}
