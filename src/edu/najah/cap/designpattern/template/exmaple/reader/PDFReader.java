package edu.najah.cap.designpattern.template.exmaple.reader;

public class PDFReader extends Reader {

    protected boolean initialize() {
        System.out.println("PDF Reader: initialize");
        return true;
    }
    protected void startReading() {
        System.out.println("PDF Reader: start reading");
    }
    protected void stopReading() {
        System.out.println("PDF Reader: stop reading");
    }
    protected void close() {
        System.out.println("PDF Reader: close");
    }

}
