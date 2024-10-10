package DesginPatterns.Adapter;

import DesginPatterns.Adapter.Adapters.BankApi;
import DesginPatterns.Adapter.Adapters.IciciBankAdapter;
import DesginPatterns.Adapter.Adapters.YesBankAdapter;

public class PhonePe {
    BankApi bank = new YesBankAdapter();
    public void getBalance(){
        bank.getBalance();
    }
    public void transferBalance(){
        bank.transferMoney();
    }

}
