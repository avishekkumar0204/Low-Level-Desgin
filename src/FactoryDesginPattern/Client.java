package FactoryDesginPattern;

public class Client {
    public static void main(String[] args) {
        Android android = new Android();
        Website wb = new Website();
        wb.createPage(android);

        IOS ios = new IOS();
        wb.createPage(ios);
    }
}
