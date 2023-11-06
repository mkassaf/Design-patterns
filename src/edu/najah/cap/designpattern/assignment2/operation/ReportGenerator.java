package edu.najah.cap.designpattern.assignment2.operation;


public interface ReportGenerator {
    void generateReport(String id);
    ReportGenerator getCopy();

    void setId(String id);
}
