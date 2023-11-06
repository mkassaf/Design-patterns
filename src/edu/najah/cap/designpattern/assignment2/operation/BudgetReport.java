package edu.najah.cap.designpattern.assignment2.operation;

import edu.najah.cap.designpattern.assignment2.db.MemeryDatabase;
import edu.najah.cap.designpattern.assignment2.user.Manager;

public class BudgetReport implements ReportGenerator, Cloneable {
    private String id;


    @Override
    public void generateReport(String id) {
        String currentMonth = "January";
        Manager manager = (Manager) MemeryDatabase.getInstance("manager").getUser(id);
        System.out.println("Budget Report: Id: " + this.id + " " + manager.getBudget(currentMonth));
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
