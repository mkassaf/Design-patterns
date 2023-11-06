package edu.najah.cap.designpattern.assignment2.operation;

public class ReportFactory {
    private ReportFactory() {}

    public static ReportGenerator getReport(String reportType) {
        if (reportType.equals("staff")) {
            return new StaffDetailsReport();
        } else if (reportType.equals("budget")) {
            return new BudgetReport();
        }
        throw new IllegalArgumentException("Invalid report type");
    }
}
