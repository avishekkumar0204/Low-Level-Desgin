package Concurrency.AdderSubtractor;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    Value val;
    int upto;
    Lock l;
    Adder(Value val, int upto, Lock l){
        this.val = val;
        this.upto = upto;
        this.l = l;
    }
    public void run(){
        for(int i = 1; i <= upto; i++){
            l.lock();
            System.out.print(this.val.val + " + " + i + " = ");
            this.val.val += i;
            System.out.println(this.val.val + " Pool ---> " + Thread.currentThread().getName());
            l.unlock();
        }
    }
}
