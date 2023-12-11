package edu.najah.cap.designpattern.observer.exmaple2;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private final  WeartherStation station ;


    Application() {
        station = new WeartherStation();
    }


    public WeartherStation getStation() {
        return station;
    }

    public static void main(String[] args) {
        Other other = new Other();
        Application app = new Application();

        app.getStation().registerObserver(new MobileApplication(1));
        app.getStation().registerObserver(new MobileApplication(2));

        app.getStation().registerObserver(new WebApplication(1));

        var watchApp = new WartchApplication(1, new YahooWeather());


        setTemperature(app, 10);

        setTemperature(app, 20);

        other.updateWeather(app.getStation());

    }

    private static void setTemperature(Application app, int tmp) {
        app.getStation().setTemperature(tmp);
    }

}
