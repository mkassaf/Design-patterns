package edu.najah.cap.designpattern.prototype.good;

public class App {


    public static void main(String[] args) {
        System.out.println("Hi");

        //Color shallowRed = ColorStore.red;//Shallow copy

        //Deep copy
        Color deeplCopyRed = ColorStore.getCopy("Red");

        System.out.println(ColorStore.colors.get("Red"));//255,0,0
        System.out.println(deeplCopyRed);//255,0,0

        if (ColorStore.colors.get("Red") == deeplCopyRed) {
            System.out.println("Same object");
        } else {
            System.out.println("Not same object");
        }
        if (ColorStore.colors.get("Red").equals(deeplCopyRed)) {
            System.out.println("Same values");
        } else {
            System.out.println("Not same values");
        }

        deeplCopyRed.setBlue(1);
        deeplCopyRed.setGreen(1);

        System.out.println(ColorStore.colors.get("Red"));//255,0,0 ?
        System.out.println(deeplCopyRed);//255,1,1 ok

        ColorStore.colors.get("Red").setRed(240);

        System.out.println(ColorStore.colors.get("Red"));//240,1,1 ?
        System.out.println(deeplCopyRed);//240,1,1 ok

    }
}
