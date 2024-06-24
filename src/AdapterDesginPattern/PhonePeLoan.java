package AdapterDesginPattern;

public class PhonePeLoan {
    boolean loanCheck(BankAPI yb){
        if(yb.showBalance() >= 100) {
            System.out.println("Eligible for loan!!");
            return true;
        }
        System.out.println("Not Eligible for loan!!");
        return false;
    }
}
