package edu.najah.cap.designpattern.examples;

public class Application {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        System.out.println("----------------------------------------------------");

        image.display();
    }
}
