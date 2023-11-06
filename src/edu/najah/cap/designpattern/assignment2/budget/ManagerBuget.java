package edu.najah.cap.designpattern.assignment2.budget;

import edu.najah.cap.designpattern.assignment2.db.MemeryDatabase;
import edu.najah.cap.designpattern.assignment2.user.Manager;

public class ManagerBuget implements Budget {

    @Override
    public double getBudget(String month, String id) {
        Manager manager = (Manager)MemeryDatabase.getInstance(id).getUser(id);

        var total = manager.getHoursWorkedPerMonth().get(month) * manager.getHourlyRate();
        for (var staff : manager.getStaff()) {
            total += staff.getHoursWorkedPerMonth().get(month) * staff.getHourlyRate();
        }
        return total;
    }
}
