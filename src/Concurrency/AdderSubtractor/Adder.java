package Concurrency.AdderSubtractor;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    Value val;
    int upto;
    Adder(Value val, int upto){
        this.val = val;
        this.upto = upto;
    }
    public void run(){
        for(int i = 1; i <= upto; i++){
            synchronized(val) {
                System.out.print(this.val.val + " + " + i + " = ");
                this.val.val += i;
                System.out.println(this.val.val + " Pool ---> " + Thread.currentThread().getName());
            }
        }
    }
}
