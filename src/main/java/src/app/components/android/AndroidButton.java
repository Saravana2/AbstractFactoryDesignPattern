package app.components.android;

import app.components.UIButton;


public class AndroidButton implements UIButton {
    @Override
    public void paintButton() {
        System.out.println("Android : Button");
    }
}