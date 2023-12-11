package edu.najah.cap.designpattern.assnment3.decorator;

import edu.najah.cap.designpattern.assnment3.component.Weather;
import edu.najah.cap.designpattern.assnment3.subject.ISubject;

public abstract class  Decorator implements Weather {
    protected Weather weather;
    protected String value;

    private ISubject subject;
    protected Decorator(Weather weather, String value){
        this.weather = weather;
        this.value = value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
        subject.setValue(value);
    }
    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getStatus() {
        return weather.getStatus() + "\n " + getDescrption() + " :: " + this.getValue() + " " + this.getUnit();

    }

    public ISubject getSubject() {
        return subject;
    }

    public void setSubject(ISubject subject) {
        this.subject = subject;
    }
}
