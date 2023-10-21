package edu.najah.cap.designpattern.prototype.bad;

public class App {


    public static void main(String[] args) {

        Color shallowRed = ColorStore.red;//Shallow copy
        if (shallowRed == ColorStore.red) {
            System.out.println("shallowRed == ColorStore.red");
        }

        Color deeplCopyRed = new Color(ColorStore.red.getRed(), ColorStore.red.getGreen(), ColorStore.red.getBlue());

        Color copy = ColorStore.red.copy();


        if (deeplCopyRed == ColorStore.red) {
            System.out.println("deeplCopyRed == ColorStore.red");
        } else {
            System.out.println("deeplCopyRed != ColorStore.red");
        }
        if (copy == ColorStore.red) {
            System.out.println("copy == ColorStore.red");
        } else {
            System.out.println("copy != ColorStore.red");
        }
        if (ColorStore.red.equals(copy)) {
            System.out.println("ColorStore.red equals copy2");
        } else {
            System.out.println("ColorStore.red does not equal  copy2");
        }
        if (ColorStore.red.equals(deeplCopyRed)) {
            System.out.println("ColorStore.red equals deeplCopyRed");
        } else {
            System.out.println("ColorStore.red does not equal deeplCopyRed");
        }

        System.out.println(ColorStore.red);//255,0,0
        System.out.println(shallowRed);//255,0,0
        System.out.println(deeplCopyRed);//255,0,0
        System.out.println(copy);//255,0,0

        System.out.println("______________________________________");

        shallowRed.setBlue(1);
        shallowRed.setGreen(1);

        System.out.println(ColorStore.red);//255,1,1
        System.out.println(shallowRed);//255,1,1
        System.out.println(deeplCopyRed);
        System.out.println(copy);

        System.out.println("______________________________________");

        ColorStore.red.setRed(240);
        deeplCopyRed.setRed(230);
        copy.setRed(220);
        System.out.println(ColorStore.red);//240,1,1
        System.out.println(shallowRed);//240,1,1
        System.out.println(deeplCopyRed);
        System.out.println(copy);


    }
}
