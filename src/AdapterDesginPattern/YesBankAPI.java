package AdapterDesginPattern;

public class YesBankAPI {
    int transferAmount = 0;
    int getBalance(){
        return 100;
    }
    void transferMoney(){
        System.out.println(transferAmount + " transferred via YesBank!!");
    }
    void setTransferAmount(int amount){
        this.transferAmount = amount;
    }
}
