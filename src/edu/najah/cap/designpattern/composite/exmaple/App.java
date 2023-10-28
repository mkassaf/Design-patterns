package edu.najah.cap.designpattern.composite.exmaple;

import java.util.List;

public class App {

    public static void main(String[] args) {
        /*
            We have box that contains either another box or a product
            we need to calculate the weight of the box considering the weight of empty box is 10 grams
         */

        Item item1 = new Product(10);
        Item item2 = new Product(20);
        Item item3 = new Product(30);
        Item item4 = new Product(40);

        Item box1 = new Box(List.of(item1, item2));
        Item box2 = new Box(List.of(item3, item4));

        Item item5 = new Product(50);
        Item box3 = new Box(List.of(box1, box2, item5));

        System.out.println("Total weight: " + box3.getWeight());
    }
}
