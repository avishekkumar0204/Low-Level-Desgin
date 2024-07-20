package FactoryDesginPattern;

public class Website {
    void createPage(Platform pf){
        pf.createButton();
        pf.createNavbar();
        pf.createMenu();
    }
}
