package edu.najah.cap.designpattern.composite.exmaple;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item {

    private final List<Item> items;

    public Box(List<Item> items) {
        this.items = items;
    }

    @Override
    public double getWeight() {
        double weight = 10;
        for (Item item : items) {
            weight += item.getWeight();
        }
        return weight;
    }
}
