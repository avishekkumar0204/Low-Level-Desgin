package FactoryDesginPattern;

public class AndroidFactory implements UIComponentFactory{
    public void createButton(){
        System.out.println("Android Button");
    }

    public void createMenu(){
        System.out.println("Android Menu");
    }

    public void createNavBar(){
        System.out.println("Android Navbar");
    }
}
