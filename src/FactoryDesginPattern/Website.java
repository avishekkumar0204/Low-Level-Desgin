package FactoryDesginPattern;
public class Website {
    void createPage(Platform pf){
        pf.createUIComponentFactory();
    }
}
