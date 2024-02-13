package app.solution;

import app.solution.applications.AndroidAppFactory;
import app.solution.applications.AppFactory;
import app.solution.applications.iOSAppFactory;

public class Application {

    AppFactory appFactory;

    public Application(AppFactory uiFactory) {
        this.appFactory = uiFactory;
    }

    void execute() {
        System.out.println("Executing " + appFactory.getClass().getName());
        appFactory.createButton().paintButton();
        appFactory.createCalendarView().paintCalendar();
    }

    public static void main(String[] args) {
        Application iosApp = new Application(new iOSAppFactory());
        iosApp.execute();
        System.out.println();
        Application androidApp = new Application(new AndroidAppFactory());
        androidApp.execute();
    }
}

