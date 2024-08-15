package AdderSubtractor;

public class Value {
    int val;
    Value(int val){
        this.val = val;
    }

    // Synchronised method will take a lock on object for which the method is called
    synchronized void increamentBy(int i){
        System.out.print(this.val + " + " + i + " = ");
        this.val += i;
        System.out.println(this.val + " Pool --> " + Thread.currentThread().getName());
    }

    synchronized void decreamentBy(int i){
        System.out.print(this.val + " - " + i + " = ");
        this.val -= i;
        System.out.println(this.val + " Pool --> " + Thread.currentThread().getName());
    }
}
