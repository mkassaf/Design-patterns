package edu.najah.cap.designpattern.proxy.good;

public class InternetProxcy implements Internet {//Compatible with system (has the behaviour of internet)

    private Internet internet;//has an  internet object

    public InternetProxcy(Internet internet) {
        this.internet = internet;
    }

    @Override
    public void connect(String url) {

        if (isAllowed(url)){
            internet.connect(url);
        } else {
            System.out.println("Not allowed to connect to internet");
        }
    }

    private boolean isAllowed(String url) {
        if (!isStudent()){
            return true;
        }
        if (url.contains("facebook")){
            return false;
        }
        return true;
    }

    private boolean isStudent() {
        //logic
        return true;
    }
}
