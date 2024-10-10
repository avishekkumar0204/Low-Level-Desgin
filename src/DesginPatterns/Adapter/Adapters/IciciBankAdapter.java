package DesginPatterns.Adapter.Adapters;

import DesginPatterns.Adapter.Banks.Icici;

public class IciciBankAdapter implements BankApi{
    Icici ic = new Icici();
    public void getBalance(){
        ic.balCheck();
    }
    public void transferMoney(){
        ic.moneyTransfer();
    }
}
