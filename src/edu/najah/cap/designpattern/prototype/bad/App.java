package edu.najah.cap.designpattern.prototype.bad;

public class App {


    public static void main(String[] args) {


        Color shallowRed = ColorStore.red;//Shallow copy

        //Deep copy
        Color deeplCopyRed = new Color(ColorStore.red.getRed(), ColorStore.red.getGreen(), ColorStore.red.getBlue());


        System.out.println(ColorStore.red);//255,0,0
        System.out.println(shallowRed);//255,0,0

        shallowRed.setBlue(1);
        shallowRed.setGreen(1);

        System.out.println(ColorStore.red);//255,1,1 ?
        System.out.println(shallowRed);//255,1,1 ok

        ColorStore.red.setRed(240);

        System.out.println(ColorStore.red);//240,1,1 ?
        System.out.println(shallowRed);//240,1,1 ok

    }
}
