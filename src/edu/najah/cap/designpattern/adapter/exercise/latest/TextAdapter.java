package edu.najah.cap.designpattern.adapter.exercise.latest;

import edu.najah.cap.designpattern.adapter.exercise.old.TextConvertor;

public class TextAdapter extends TextConvertor implements DocumentConverter  {

    @Override
    public void convertDocument(String fileName) {
        this.convertText(fileName);
    }
}
