package DesginPatterns.Adapter.Adapters;


import DesginPatterns.Adapter.Banks.YesBank;

public class YesBankAdapter implements BankApi{
    YesBank yb = new YesBank();
    public void getBalance(){
        yb.getBalance();
    }
    public void transferMoney(){
        yb.transferBalance();
    }
}
