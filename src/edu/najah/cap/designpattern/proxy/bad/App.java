package edu.najah.cap.designpattern.proxy.bad;

public class App {

    public static void main(String[] args) {
        Internet connection = new RealInternet();


        connection.connect("zajel.najah.edu");
        connection.connect("facebook.com");
        connection.connect("google.com");


    }
}
