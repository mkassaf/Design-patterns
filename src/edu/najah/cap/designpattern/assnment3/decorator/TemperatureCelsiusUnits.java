package edu.najah.cap.designpattern.assnment3.decorator;

import edu.najah.cap.designpattern.assnment3.component.Weather;

public class TemperatureCelsiusUnits extends Decorator {


    public TemperatureCelsiusUnits(Weather weather, String value) {
        super(weather, value);
    }

    @Override
    public String getUnit() {
        return "C";
    }

    @Override
    public String getDescrption() {
        return "Temperature";
    }

}
