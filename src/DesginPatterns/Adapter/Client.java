package DesginPatterns.Adapter;

public class Client {
    public static void main(String[] args) {
        PhonePe p = new PhonePe();
        p.getBalance();
        p.transferBalance();
    }
}
