package edu.najah.cap.designpattern.adapter.exercise.latest;

public class DocConvert implements DocumentConverter {

        @Override
        public void convertDocument(String fileName) {
            System.out.println("Converting Doc File :" + fileName);
        }
}
