package edu.najah.cap.designpattern.assignment2.user;

import edu.najah.cap.designpattern.assignment2.budget.Budget;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Staff {
    private List<Staff> staffList;

    private Budget budget;
    public Manager(String id, String name, int age, double hourlyRate, String staffId, Budget budget) {
        super(id, name, age, hourlyRate, staffId);
        staffList = new ArrayList<>();
        this.budget = budget;
    }

    public void addStaff(Staff staff) {
        staffList.add(staff);
    }
    public List<Staff> getStaff() {
        return staffList;
    }
    @Override
    public double getBudget(String month) {
        return budget.getBudget(month, this.getId());
    }
}
