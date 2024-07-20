package FactoryDesginPattern;

public class Android implements Platform{

    public void createButton() {
        System.out.println("Android createButton");
    }

    public void createMenu(){
        System.out.println("Android createMenu");

    }

    public void createNavbar(){
        System.out.println("Android createNavbar");
    }
}
