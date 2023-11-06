package edu.najah.cap.designpattern.assignment2;

import edu.najah.cap.designpattern.assignment2.budget.ManagerBuget;
import edu.najah.cap.designpattern.assignment2.db.MemeryDatabase;
import edu.najah.cap.designpattern.assignment2.operation.ExecuteReport;
import edu.najah.cap.designpattern.assignment2.user.Manager;
import edu.najah.cap.designpattern.assignment2.user.Staff;

public class Application {

    public static void main(String[] args) {
        Staff staff1 = new Staff("1", "Ahmad", 25, 10, "1");
        Staff staff2 = new Staff("2", "Ali", 30, 15, "2");
        Staff staff3 = new Staff("3", "Mohammad", 35, 20, "3");


        Manager manager1 = new Manager("4", "Khalid", 40, 25, "4", new ManagerBuget());
        Manager manager2 = new Manager("5", "Hassan", 45, 30, "5", new ManagerBuget());//Director

        Staff staff4  = new Staff("6", "Omar", 50, 35, "6");

        manager1.addStaff(staff1);
        manager1.addStaff(staff2);
        manager1.addStaff(staff3);

        manager2.addStaff(manager1);
        manager2.addStaff(staff4);

        MemeryDatabase.getInstance(manager1.getId()).addUser(manager1);
        MemeryDatabase.getInstance(manager2.getId()).addUser(manager2);

        ExecuteReport.executeReport("staff", "1", manager1.getId());
        ExecuteReport.executeReport("staff", "2", manager2.getId());

    }
}
