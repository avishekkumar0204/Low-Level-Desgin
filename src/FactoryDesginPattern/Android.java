package FactoryDesginPattern;
public class Android implements Platform{
    public void createUIComponentFactory(){
        AndroidFactory android = new AndroidFactory();
        android.createButton();
        android.createMenu();
        android.createNavBar();
    }
}
