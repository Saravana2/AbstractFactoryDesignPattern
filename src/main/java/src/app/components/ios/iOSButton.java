package app.components.ios;

import app.components.UIButton;

public class iOSButton implements UIButton {
    @Override
    public void paintButton() {
        System.out.println("iOS : Button");
    }
}