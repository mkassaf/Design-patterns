package edu.najah.cap.designpattern.assignment2.user;

public class Staff extends User {
    private String staffId;
    public Staff(String id, String name, int age, double hourlyRate, String staffId) {
        super(id, name, age, hourlyRate);
        this.staffId = staffId;
    }

    @Override
    public double getBudget(String month) {
        var hourlyRate = this.getHourlyRate();
        var numberOfHour = this.getHoursWorkedPerMonth().get(month);
        return hourlyRate * numberOfHour;
    }

    @Override
    public String toString() {
        return "Id : " + this.getId() + ", Name: " + this.getName() + ", Age: " + this.getAge() + ", Hourly Rate: "
                + this.getHourlyRate() + ", Staff Id: " + this.staffId;
    }
}
