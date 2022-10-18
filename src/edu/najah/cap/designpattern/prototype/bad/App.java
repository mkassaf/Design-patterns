package edu.najah.cap.designpattern.prototype.bad;

public class App {

    public static void main(String[] args) {
        Color red = new Color(255,0,0);
        Color green =  new Color(0, 255, 0);
        Color blue =  new Color(0, 0, 255);

        Color copyRed = red;

        System.out.println(red);
        System.out.println(copyRed);

        copyRed.setBlue(1);
        copyRed.setGreen(1);

        System.out.println(red);
        System.out.println(copyRed);


    }
}
