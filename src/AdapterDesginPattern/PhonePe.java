package AdapterDesginPattern;

public class PhonePe {
    YesBankAPI yb = new YesBankAPI();
    PhonePeLoan loan = new PhonePeLoan();
    MobileRecharge ft = new MobileRecharge();

    boolean checkLoanEligibility(){
        return loan.loanCheck(yb);
    }

    boolean mobileRecharge(int amount){
        return ft.recharge(yb, amount);
    }
}
