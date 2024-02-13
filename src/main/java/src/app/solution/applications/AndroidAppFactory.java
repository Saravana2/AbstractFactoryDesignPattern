package app.solution.applications;

import app.components.UIButton;
import app.components.UICalendarView;
import app.components.android.AndroidButton;
import app.components.android.AndroidCalendarView;

public class AndroidAppFactory implements AppFactory {
    @Override
    public UIButton createButton() {
        return new AndroidButton();
    }

    @Override
    public UICalendarView createCalendarView() {
        return new AndroidCalendarView();
    }
}