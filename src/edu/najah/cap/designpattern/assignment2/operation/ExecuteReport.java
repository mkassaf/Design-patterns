package edu.najah.cap.designpattern.assignment2.operation;

import edu.najah.cap.designpattern.assignment2.ReportStore;

public class ExecuteReport {

    public static void executeReport(String reportType, String reportId, String itemId) {
        ReportGenerator reportGenerator = ReportStore.getReport(reportType);
        reportGenerator.setId(reportId);
        reportGenerator.generateReport(itemId);
    }
}
