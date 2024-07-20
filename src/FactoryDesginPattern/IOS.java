package FactoryDesginPattern;

public class IOS implements Platform{
    public void createButton(){
        System.out.println("IOS createBtn");
    }
    public void createMenu(){
        System.out.println("IOS createMenu");
    }
    public void createNavbar(){
        System.out.println("IOS createNavbar");
    }
}
