package app.problem.applications;

import app.components.UIButton;
import app.components.UICalendarView;
import app.components.android.AndroidButton;
import app.components.android.AndroidCalendarView;

public class AndroidApp {
    public UIButton createButton() {
        return new AndroidButton();
    }

    public UICalendarView createCalendarView() {
        return new AndroidCalendarView();
    }
}