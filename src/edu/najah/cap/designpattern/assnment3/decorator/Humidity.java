package edu.najah.cap.designpattern.assnment3.decorator;

import edu.najah.cap.designpattern.assnment3.component.Weather;

public class Humidity extends Decorator {

    public Humidity(Weather weather, String value) {
        super(weather, value);
    }

    @Override
    public String getUnit() {
        return "%";
    }

    @Override
    public String getDescrption() {
        return "Humidity";
    }
}
