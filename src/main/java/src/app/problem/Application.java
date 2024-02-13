package app.problem;

import app.problem.applications.AndroidApp;
import app.problem.applications.iOSApp;

public class Application {

    AndroidApp androidApp;
    iOSApp iOSApp;

    public Application(AndroidApp androidApp, iOSApp iOSApp) {
        this.androidApp = androidApp;
        this.iOSApp = iOSApp;
    }

    void executeAndroid() {
        System.out.println("Executing " + androidApp.getClass().getName());
        androidApp.createButton().paintButton();
        androidApp.createCalendarView().paintCalendar();
    }

    void executeIOS() {
        System.out.println("Executing " + iOSApp.getClass().getName());
        iOSApp.createButton().paintButton();
        iOSApp.createCalendarView().paintCalendar();
    }

    public static void main(String[] args) {
        Application application = new Application(new AndroidApp(), new iOSApp());
        application.executeIOS();
        System.out.println();
        application.executeAndroid();
    }
}

