package IntroToThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void>{
    Value value;
    ExecutorService es;
    Lock lock;
    Subtractor(Value value, ExecutorService es, Lock lock) {
        this.value = value;
        this.es = es;
        this.lock = lock;
    }
    public Void call()  {
        for(int i = 1; i <= 10; i++){
            synchronized(value) {
                System.out.print(this.value.val + " - " + i + " = ");
                this.value.val -= i;
                System.out.println(this.value.val + " " + Thread.currentThread().getName());
            }
        }
        return null;
    }


}
