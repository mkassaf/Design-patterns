package edu.najah.cap.designpattern.adapter.exercise.latest;

public class ExcelConverter implements DocumentConverter {

        @Override
        public void convertDocument(String fileName) {
            System.out.println("Converting Excel File :" + fileName);
        }
}
