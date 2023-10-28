package edu.najah.cap.designpattern.template.exmaple;

import edu.najah.cap.designpattern.template.exmaple.reader.PDFReader;
import edu.najah.cap.designpattern.template.exmaple.reader.Reader;
import edu.najah.cap.designpattern.template.exmaple.reader.XMLReader;

public class App {

    public static void main(String[] args) {

        PDFReader pdfReader = new PDFReader();
        process(pdfReader);

        XMLReader xmlReader = new XMLReader();
        process(xmlReader);

    }

    public static void process(Reader xmlReader) {
        xmlReader.read();
    }

}

