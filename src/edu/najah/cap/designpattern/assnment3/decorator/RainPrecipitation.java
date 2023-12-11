package edu.najah.cap.designpattern.assnment3.decorator;

import edu.najah.cap.designpattern.assnment3.component.Weather;

public class RainPrecipitation extends Decorator {
    private String name;
    public RainPrecipitation(Weather weather, String value, String name) {
        super(weather, value);
        this.name = name;
    }


    @Override
    public String getUnit() {
        return "%";
    }

    @Override
    public String getDescrption() {
        return name;
    }
}
