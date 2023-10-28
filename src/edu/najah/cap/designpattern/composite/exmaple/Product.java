package edu.najah.cap.designpattern.composite.exmaple;

public class Product implements Item {

    private double weight;

    public Product(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
