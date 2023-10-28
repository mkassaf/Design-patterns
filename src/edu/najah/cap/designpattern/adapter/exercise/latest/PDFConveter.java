package edu.najah.cap.designpattern.adapter.exercise.latest;

public class PDFConveter implements DocumentConverter {

    @Override
    public void convertDocument(String fileName) {
        System.out.println("Converting PDF File :" + fileName);
    }
}
