package app.solution.applications;

import app.components.UIButton;
import app.components.UICalendarView;

public interface AppFactory {
    UIButton createButton();

    UICalendarView createCalendarView();
}