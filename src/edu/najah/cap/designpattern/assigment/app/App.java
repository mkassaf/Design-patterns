package edu.najah.cap.designpattern.assigment.app;

import edu.najah.cap.designpattern.assigment.color.Color;
import edu.najah.cap.designpattern.assigment.color.ColorStore;

public class App {

    public static void main(String[] args) {

        Color color = ColorStore.getInstance(4,5,6);
        Color color2 = ColorStore.getInstance(4,5,6);
        System.out.println("++++++=====================");
        Color blue = ColorStore.getInstance(0,0,255);
        Color blue2 = ColorStore.getInstance(255,0,0);
        Color blue3 = ColorStore.getInstance(0,0,0);

        System.out.println(color2 == color);//true

        color.print();
        blue.print();
        blue3.print();
        blue2.print();
    }
}
