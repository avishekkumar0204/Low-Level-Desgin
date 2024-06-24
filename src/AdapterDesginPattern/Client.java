package AdapterDesginPattern;

public class Client {
    public static void main(String[] args) {
        PhonePe p = new PhonePe();
        p.checkLoanEligibility();
        p.mobileRecharge(100);
    }
}
