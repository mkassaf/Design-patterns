package edu.najah.cap.designpattern.assnment3.decorator;

import edu.najah.cap.designpattern.assnment3.component.Weather;

public class TemperatureFahrenheitUnits extends Decorator {

    public TemperatureFahrenheitUnits(Weather weather, String value) {
        super(weather, value);
    }

    @Override
    public String getUnit() {
        return "F";
    }

    @Override
    public String getDescrption() {
        return "Temperature";
    }
}
