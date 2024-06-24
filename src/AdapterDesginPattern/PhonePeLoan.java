package AdapterDesginPattern;

public class PhonePeLoan {
    boolean loanCheck(YesBankAPI yb){
        if(yb.getBalance() >= 100) {
            System.out.println("Eligible for loan!!");
            return true;
        }
        System.out.println("Not Eligible for loan!!");
        return false;
    }
}
