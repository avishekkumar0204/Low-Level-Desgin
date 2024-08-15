package IntroToThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class Adder implements Callable<Void> {
    Value value;
    ExecutorService es;
    Adder(Value value, ExecutorService es) {
        this.value = value;
        this.es = es;
    }
    public Void call() {
        for(int i = 1; i <= 10; i++){
            System.out.print(this.value.val + " + " + i + " = ");
            this.value.val += i;
            System.out.println(this.value.val + " " + Thread.currentThread().getName());
        }
        return null;
    }
}
