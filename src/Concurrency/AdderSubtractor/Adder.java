package Concurrency.AdderSubtractor;

public class Adder implements Runnable {
    Value val;
    int upto;
    Adder(Value val, int upto){
        this.val = val;
        this.upto = upto;
    }
    public void run(){
        for(int i = 1; i <= upto; i++){
            this.val.val += i;
        }
    }
}
