package edu.najah.cap.designpattern.proxy;

public class Printer {

    public static void print(String text){
        if (text.contains("Nablus")) {
            text = text.replaceAll("Nablus", "****");
        }
        System.out.println(text);
    }
}
