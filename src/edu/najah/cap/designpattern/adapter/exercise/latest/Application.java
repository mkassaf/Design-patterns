package edu.najah.cap.designpattern.adapter.exercise.latest;

import edu.najah.cap.designpattern.adapter.exercise.old.PDFConverter;

public class Application {

    //Adapter Pattern or Wrapper Pattern
    public static void main(String[] args) {
        DocumentConverter docConvert = new DocConvert();
        ExcelConverter excelConvert = new ExcelConverter();
        convertDocument(docConvert, "test.doc");
        convertDocument(excelConvert, "test.xls");

        PDFConverter pdfConverter = new PDFConverter();

        PDFAdpater pdfAdpater = new PDFAdpater(pdfConverter);

        //convertDocument(pdfConverter, "test.pdf"); only accepts DocumentConverter
        convertDocument(pdfAdpater, "test.pdf");
    }



    public static void convertDocument(DocumentConverter documentConverter, String fileName){
        documentConverter.convertDocument(fileName);
    }
}
