package edu.najah.cap.designpattern.proxy.good;

public class RealInternet implements Internet {

    @Override
    public void connect(String url) {
        System.out.println("Connected to " + url );
    }

}
