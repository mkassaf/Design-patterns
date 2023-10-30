package edu.najah.cap.designpattern.decorator.example.usingComposition;

public abstract class BeverageDecortaor implements Bevrage {

    private Bevrage bevrage;

    public BeverageDecortaor(Bevrage bevrage) {
        this.bevrage = bevrage;
    }

    public Bevrage getBevrage() {
        return bevrage;
    }

}
