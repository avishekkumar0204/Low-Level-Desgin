package AdapterDesginPattern;

public class PhonePe {
    BankAPI yb = new ICICIBankAPIAdapter();
    PhonePeLoan loan = new PhonePeLoan();
    MobileRecharge ft = new MobileRecharge();

    boolean checkLoanEligibility(){
        return loan.loanCheck(yb);
    }

    boolean mobileRecharge(int amount){
        return ft.recharge(yb, amount);
    }

    void transferAmount(int amount){
        yb.transferBalance(amount);
    }
}
