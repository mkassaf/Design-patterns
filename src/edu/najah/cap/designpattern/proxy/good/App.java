package edu.najah.cap.designpattern.proxy.good;

public class App {

    public static void main(String[] args) {
        Internet internet = null;

        Internet realInternet = new RealInternet();

        Internet proxyInternet = new ProxyInternet(realInternet);

        internet = realInternet;

        connectTo(internet, "zajel.najah.edu");
        connectTo(internet, "facebook.com");
        connectTo(internet,"google.com");


    }


    public static void connectTo(Internet realInternet, String url) {
        System.out.println("Connecting to " + url );
        realInternet.connect(url);
    }
}
