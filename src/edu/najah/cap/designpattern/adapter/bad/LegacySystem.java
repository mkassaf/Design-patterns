package edu.najah.cap.designpattern.adapter.bad;

public class LegacySystem {

    public String getResult(){
        String result = process();
        //logic
        return result;
    }

    private String process() {
        System.out.println("processing .... ");
        //logic
        return "Ahmad:195";
    }
}
