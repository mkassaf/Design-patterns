package edu.najah.cap.designpattern.template.exmaple.reader;

public class XMLReader extends Reader {
    protected boolean initialize() {
        System.out.println("XML Reader: initialize");
        return true;
    }
    protected void startReading() {
        System.out.println("XML Reader: start reading");
    }
    protected void stopReading() {
        System.out.println("XML Reader: stop reading");
    }
    protected void close() {
        System.out.println("XML Reader: close");
    }

}
