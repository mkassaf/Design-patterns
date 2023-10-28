package edu.najah.cap.designpattern.proxy.good;

public class ProxyInternet implements Internet {

    private final Internet realInternet;

    public ProxyInternet(Internet realInternet) {
        this.realInternet = realInternet;
    }

    @Override
    public void connect(String url) {
        if (isUrlAllowed(url)) {
            realInternet.connect(url);
        } else {
            System.out.println("Access Denied");
        }

    }

    private boolean isUrlAllowed(String url) {
        if (url.contains("facebook") || url.contains("twitter")) {
            return false;
        } else if (url.contains("google")) {
            return false;
        }
        return true;
    }
}
