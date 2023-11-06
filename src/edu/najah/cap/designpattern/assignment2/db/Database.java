package edu.najah.cap.designpattern.assignment2.db;

import edu.najah.cap.designpattern.assignment2.user.Staff;
import edu.najah.cap.designpattern.assignment2.user.User;

import java.util.List;

public interface Database {
    void connect();

    User getUser(String id);
    void addUser(User user);

    List<Staff> getStaffList(String id);
}
