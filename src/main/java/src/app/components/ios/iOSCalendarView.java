package app.components.ios;

import app.components.UICalendarView;

public class iOSCalendarView implements UICalendarView {
    @Override
    public void paintCalendar() {
        System.out.println("iOS : Calendar View");
    }
}