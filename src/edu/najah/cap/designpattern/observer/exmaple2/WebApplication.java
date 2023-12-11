package edu.najah.cap.designpattern.observer.exmaple2;

public class WebApplication implements Observer {

    private int id;
    private int temperature;

    public WebApplication(int id) {
        this.id = id;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    public void show() {
        System.out.println("Web Application: " + this.id +  " : "  + temperature);
    }

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        show();
    }
}
