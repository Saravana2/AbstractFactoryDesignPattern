package app.components.android;

import app.components.UICalendarView;

public class AndroidCalendarView implements UICalendarView {

    @Override
    public void paintCalendar() {
        System.out.println("Android : Calendar View");
    }
}