package edu.najah.cap.designpattern.examples;

public class ProxyImage implements Image {

    private Image image;
    private final String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new HighResolutionImage(filename);
        }
        image.display();
    }



}
