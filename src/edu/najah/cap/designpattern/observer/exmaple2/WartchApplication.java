package edu.najah.cap.designpattern.observer.exmaple2;

public class WartchApplication implements Observer {
    private int id;
    private int temperature;

    public WartchApplication(int id, Subject weartherStation) {
        this.id = id;
        weartherStation.registerObserver(this);
    }


    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        show();
    }

    private void show() {
        System.out.println("Wartch Application: " + this.id +  " : "  + temperature);
    }
}
