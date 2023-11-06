package edu.najah.cap.designpattern.assignment2.operation;


import edu.najah.cap.designpattern.assignment2.db.MemeryDatabase;
import edu.najah.cap.designpattern.assignment2.user.Staff;

import java.util.List;

public class StaffDetailsReport implements ReportGenerator, Cloneable {

    private String id;
    @Override
    public void generateReport(String id) {
        List<Staff> staffList = MemeryDatabase.getInstance(id).getStaffList(id);
        System.out.println("ID " + this.id);
        for (Staff staff : staffList) {
            System.out.println("Staff: " + staff);
        }
    }

    @Override
    public ReportGenerator getCopy() {
        return (ReportGenerator) this.clone();
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }

    }

}
