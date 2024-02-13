package app.problem.applications;

import app.components.UIButton;
import app.components.UICalendarView;
import app.components.ios.iOSButton;
import app.components.ios.iOSCalendarView;

public class iOSApp {
    public UIButton createButton() {
        return new iOSButton();
    }

    public UICalendarView createCalendarView() {
        return new iOSCalendarView();
    }
}