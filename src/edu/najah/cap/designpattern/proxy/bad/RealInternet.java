package edu.najah.cap.designpattern.proxy.bad;

public class RealInternet implements Internet {
    @Override
    public void connect(String url) {
        if (isAllowed(url)){
            System.out.println("Connecting to " + url );
        } else {
            System.out.println("Not allowed to connect to internet");
        }
    }

    private boolean isAllowed(String url) {
        if (url.contains("facebook")){
            return false;
        } else if (url.contains("youtube")) {
            return false;
        }
        return true;
    }
}
