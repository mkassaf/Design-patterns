package edu.najah.cap.designpattern.adapter.exercise;

public class LegacyDB {

    public void insertRecord(boolean overwrite) {
        System.out.println("Inserting record in Legacy Database");
        //Assume this class very old and we can't change it and very big and complex
    }
}
