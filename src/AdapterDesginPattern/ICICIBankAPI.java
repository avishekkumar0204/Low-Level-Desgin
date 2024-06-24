package AdapterDesginPattern;

public class ICICIBankAPI {
    int transBal = 0;
    int getAccBal(){
        return 100;
    }

    void transAmount(){
        System.out.println(transBal + " transferred via ICICIBank");
    }

    void setTransBal(int amount){
        this.transBal = amount;
    }
}
