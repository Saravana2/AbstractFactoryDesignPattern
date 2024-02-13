package app.solution.applications;

import app.components.UIButton;
import app.components.UICalendarView;
import app.components.ios.iOSButton;
import app.components.ios.iOSCalendarView;

public class iOSAppFactory implements AppFactory {
    @Override
    public UIButton createButton() {
        return new iOSButton();
    }

    @Override
    public UICalendarView createCalendarView() {
        return new iOSCalendarView();
    }
}