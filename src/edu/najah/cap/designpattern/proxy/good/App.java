package edu.najah.cap.designpattern.proxy.good;

public class App {

    public static void main(String[] args) {

        Internet connection = new InternetProxcy(new RealInternet());
        Internet connection2 = new InternetProxcy(new SecureInternet());



        connection.connect("zajel.najah.edu");
        connection.connect("facebook.com");
        connection.connect("google.com");


    }
}
