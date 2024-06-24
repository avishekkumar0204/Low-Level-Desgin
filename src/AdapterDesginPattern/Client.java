package AdapterDesginPattern;

public class Client {
    public static void main(String[] args) {
        PhonePe p = new PhonePe();
        boolean loan = p.checkLoanEligibility();
        boolean recharged = p.mobileRecharge(100);
        p.transferAmount(500);
    }
}
