package AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    Value value;
    Subtractor(Value value) {
        this.value = value;
    }

    public Void call(){
        for(int i = 0; i <= 100; i++){
            this.value.decreamentBy(i);
        }
        return null;
    }
}
