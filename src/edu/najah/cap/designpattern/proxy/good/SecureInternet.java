package edu.najah.cap.designpattern.proxy.good;

public class SecureInternet extends RealInternet {


    @Override
    public void connect(String url) {

        if (doSecurityCheck(url)){
            super.connect(url);
        } else {
            System.out.println("you are not authorize to access ");
        }
    }

    private boolean doSecurityCheck(String url) {
        return true;
    }
}
