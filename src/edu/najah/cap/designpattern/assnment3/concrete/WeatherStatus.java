package edu.najah.cap.designpattern.assnment3.concrete;

import edu.najah.cap.designpattern.assnment3.component.Weather;

public class WeatherStatus implements Weather  {

    private String value;
    private String unit;

    private String description;

    public WeatherStatus(String value, String unit, String description) {
        this.value = value;
        this.unit = unit;
        this.description = description;
    }
    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value=value;
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
        return description;
    }
}
