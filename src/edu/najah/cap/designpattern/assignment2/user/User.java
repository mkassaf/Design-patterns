package edu.najah.cap.designpattern.assignment2.user;

import java.util.HashMap;
import java.util.Map;

public abstract class User {
    private String id;
    private String name;
    private int age;
    private double hourlyRate;
    private Map<String, Integer> hoursWorkedPerMonth;

    public User(String id, String name, int age, double hourlyRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hourlyRate = hourlyRate;
        this.hoursWorkedPerMonth = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Map<String, Integer> getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(Map<String, Integer> hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public abstract double getBudget(String month);
}
