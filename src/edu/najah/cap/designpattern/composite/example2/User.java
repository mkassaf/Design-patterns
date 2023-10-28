package edu.najah.cap.designpattern.composite.example2;

public class User {

    private String name;
    private String department;
    private int salary;

    public User(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void giveDetails() {
        System.out.println("Name: " + getName() + ", Department: " + getDepartment() + ", Salary: " + getSalary());
    }


    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
}
