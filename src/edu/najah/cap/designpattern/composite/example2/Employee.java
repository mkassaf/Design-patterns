package edu.najah.cap.designpattern.composite.example2;

public class Employee extends User {

    public Employee(String name, String department, int salary) {
        super(name, department, salary);
    }

    @Override
    public void giveDetails() {
        System.out.println("Name: " + getName() + ", Department: " + getDepartment() + ", Salary: " + getSalary());
    }
}
