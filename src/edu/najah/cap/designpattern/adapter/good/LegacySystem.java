package edu.najah.cap.designpattern.adapter.good;

public class LegacySystem {

    public String getStringResult(){
        System.out.println("Calling legacy code ... ");
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
