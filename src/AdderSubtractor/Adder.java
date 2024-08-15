package AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    Value value;
    Adder(Value value) {
        this.value = value;
    }

    public Void call(){
        for(int i = 0; i <= 100; i++){
            synchronized (value) {
                System.out.print(this.value.val + " + " + i + " = ");
                this.value.val += i;
                System.out.println(this.value.val + " Pool ---> " + Thread.currentThread().getName());
            }
        }
        return null;
    }
}
