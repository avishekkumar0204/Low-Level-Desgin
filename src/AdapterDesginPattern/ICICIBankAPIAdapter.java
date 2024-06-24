package AdapterDesginPattern;

public class ICICIBankAPIAdapter implements BankAPI{
    ICICIBankAPI ib = new ICICIBankAPI();
    public int showBalance(){
        return ib.getAccBal();
    }

    public void transferBalance(int amount){
        ib.setTransBal(amount);
        ib.transAmount();
    }
}
