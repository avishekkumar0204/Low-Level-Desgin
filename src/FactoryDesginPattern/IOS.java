package FactoryDesginPattern;
public class IOS implements Platform{
    public void createUIComponentFactory(){
        IOSFactory ios = new IOSFactory();
        ios.createButton();
        ios.createMenu();
        ios.createNavBar();
    }
}
