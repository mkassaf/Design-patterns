package edu.najah.cap.designpattern.composite.example2;

import java.util.List;

public class Manager extends User {


    private List<User> employees;

    public Manager(String name, String department, int salary, List<User> employees) {
        super(name, department, salary);
        this.employees = employees;
    }

    @Override
    public void giveDetails() {
        super.giveDetails();
        System.out.println("Employees:");
        for (User employee : employees) {
            employee.giveDetails();
            System.out.println("-------------------------");
        }
    }
}
