package edu.najah.cap.designpattern.assnment3.concrete;

import edu.najah.cap.designpattern.assnment3.component.Weather;

public class Temperature implements Weather {
    private double temperature;
    private String unit;

    public Temperature(double temperature, String unit) {
        this.temperature = temperature;
        this.unit = unit;
    }

    @Override
    public String getValue() {
        return String.valueOf(temperature);
    }

    @Override
    public void setValue(String value) {
        this.temperature = Double.parseDouble(value);
    }

    @Override
    public String getUnit() {
        return unit;
    }

    @Override
    public String getStatus() {
        return getDescrption() + " :: " + this.getValue() + " " + this.getUnit();
    }

    @Override
    public String getDescrption() {
        return "Temperature";
    }
}
