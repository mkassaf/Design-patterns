package edu.najah.cap.designpattern.assignment2.db;

import edu.najah.cap.designpattern.assignment2.user.Manager;
import edu.najah.cap.designpattern.assignment2.user.Staff;
import edu.najah.cap.designpattern.assignment2.user.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemeryDatabase implements Database {

    private static final Map<String, Database> databaseMap = new HashMap<>();

    private static final Map<String, User> userMap = new HashMap<>();

    private MemeryDatabase() {
        System.out.println("Creating a new Memery Database...");
    }

    public static Database getInstance(String user) {
        if (databaseMap.get(user) == null) {
            databaseMap.put(user, new MemeryDatabase());
        }
        return databaseMap.get(user);
    }

    @Override
    public void connect() {
        System.out.println("Connecting to Memery Database...");
    }

    @Override
    public User getUser(String id) {
        return userMap.get(id);
    }

    @Override
    public void addUser(User manager) {
        userMap.put(manager.getId(), manager);
    }

    @Override
    public List<Staff> getStaffList(String id) {
        return ((Manager) userMap.get(id)).getStaff();
    }
}
