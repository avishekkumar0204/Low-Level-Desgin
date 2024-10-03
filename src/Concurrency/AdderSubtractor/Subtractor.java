package Concurrency.AdderSubtractor;

public class Subtractor implements Runnable {
    Value val;
    int upto;
    Subtractor(Value val, int upto) {
        this.val = val;
        this.upto = upto;
    }

    public void run(){
        for(int i = 1; i <= upto; i++){
            this.val.val -= i;
        }
    }
}
