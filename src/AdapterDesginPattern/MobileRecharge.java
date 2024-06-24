package AdapterDesginPattern;

public class MobileRecharge {
    boolean recharge(YesBankAPI yb, int amount){
        if(yb.getBalance() >= amount) {
            System.out.println("Recharge Successful!!");
            return true;
        }
        System.out.println("Low Balance - Recharge Failed!!");
        return false;
    }
}
