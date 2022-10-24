package edu.najah.cap.designpattern.prototype.good;

public class App {


    public static void main(String[] args) {
        System.out.println("Hi");

        //Color shallowRed = ColorStore.red;//Shallow copy

        //Deep copy
        Color deeplCopyRed = ColorStore.getCopy("Red");

        System.out.println(ColorStore.colors.get("Red"));//255,0,0
        System.out.println(deeplCopyRed);//255,0,0

        deeplCopyRed.setBlue(1);
        deeplCopyRed.setGreen(1);

        System.out.println(ColorStore.colors.get("Red"));//255,0,0 ?
        System.out.println(deeplCopyRed);//255,1,1 ok

        ColorStore.colors.get("Red").setRed(240);

        System.out.println(ColorStore.colors.get("Red"));//240,1,1 ?
        System.out.println(deeplCopyRed);//240,1,1 ok

    }
}
