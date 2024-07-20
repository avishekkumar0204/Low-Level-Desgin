package FactoryDesginPattern;
public class Client {
    public static void main(String[] args) {
        Android android = new Android();
        Website wb = new Website();
        wb.createPage(new IOS());
    }
}
