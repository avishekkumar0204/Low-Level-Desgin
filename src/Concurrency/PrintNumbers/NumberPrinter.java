package Concurrency.PrintNumbers;

public class NumberPrinter implements Runnable {
    int num;
    NumberPrinter(int num){
        this.num = num;
    }
    public void run(){
        System.out.println(this.num + " " + Thread.currentThread().getName());
    }
}
