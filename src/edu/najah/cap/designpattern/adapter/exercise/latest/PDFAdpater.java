package edu.najah.cap.designpattern.adapter.exercise.latest;

import edu.najah.cap.designpattern.adapter.exercise.old.PDFConverter;

public class PDFAdpater implements DocumentConverter {

    private PDFConverter pdfConveter;

    public PDFAdpater(PDFConverter pdfConveter) {
        this.pdfConveter = pdfConveter;
    }

    @Override
    public void convertDocument(String fileName) {
        pdfConveter.convertPDf(fileName);
    }
}
