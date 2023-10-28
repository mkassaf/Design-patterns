package edu.najah.cap.designpattern.examples;

public class HighResolutionImage implements Image {
    private String filename;

    public HighResolutionImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + filename);
        System.out.println("Actual loading of the high-resolution image from disk");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }
}
