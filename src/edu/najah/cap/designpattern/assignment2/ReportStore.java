package edu.najah.cap.designpattern.assignment2;

import edu.najah.cap.designpattern.assignment2.operation.BudgetReport;
import edu.najah.cap.designpattern.assignment2.operation.ReportGenerator;
import edu.najah.cap.designpattern.assignment2.operation.StaffDetailsReport;

import java.util.HashMap;
import java.util.Map;

public class ReportStore {
    private ReportStore() {}

    private static final Map<String, ReportGenerator> map = new HashMap<>();

    static {
        map.put("staff", new StaffDetailsReport());
        map.put("budget", new BudgetReport());
    }

    public static ReportGenerator getReport(String reportType) {
        ReportGenerator reportGenerator =  map.get(reportType);
        return  reportGenerator.getCopy();
    }

}
