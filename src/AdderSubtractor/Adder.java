package AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    Value value;
    Lock lock;
    Adder(Value value, Lock lock) {
        this.value = value;
        this.lock = lock;
    }

    public Void call(){
        for(int i = 0; i <= 100; i++){
            lock.lock();
            System.out.print(this.value.val + " + " + i + " = ");
            this.value.val += i;
            System.out.println(this.value.val + " Pool ---> " + Thread.currentThread().getName());
            lock.unlock();
        }
        return null;
    }
}
