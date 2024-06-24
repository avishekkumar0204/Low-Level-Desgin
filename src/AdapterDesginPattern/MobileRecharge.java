package AdapterDesginPattern;

public class MobileRecharge {
    boolean recharge(BankAPI yb, int amount){
        if(yb.showBalance() >= amount) {
            System.out.println("Recharge Successful!!");
            return true;
        }
        System.out.println("Low Balance - Recharge Failed!!");
        return false;
    }
}
