package Concurrency.HelloWorld;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter hp = new HelloWorldPrinter();
        System.out.println("Thread " + Thread.currentThread().getName());
        Thread t = new Thread(hp);
        t.start();
    }
}
