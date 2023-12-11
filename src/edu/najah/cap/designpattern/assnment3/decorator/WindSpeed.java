package edu.najah.cap.designpattern.assnment3.decorator;

import edu.najah.cap.designpattern.assnment3.component.Weather;

public class WindSpeed extends Decorator {

    public WindSpeed(Weather weather, String value) {
        super(weather, value);
    }

    @Override
    public String getUnit() {
        return "m/s";
    }

    @Override
    public String getDescrption() {
        return "Wind Speed";
    }

}
