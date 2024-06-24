package AdapterDesginPattern;

public class YesBankAPIAdapter implements BankAPI{
    YesBankAPI yb = new YesBankAPI();
    public int showBalance(){
        return yb.getBalance();
    }
    public void transferBalance(int amount){
        yb.setTransferAmount(amount);
        yb.transferMoney();
    }
}
