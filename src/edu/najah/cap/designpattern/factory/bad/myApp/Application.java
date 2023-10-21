package edu.najah.cap.designpattern.factory.bad.myApp;

import edu.najah.cap.designpattern.factory.bad.Database;
import edu.najah.cap.designpattern.factory.bad.MySQLDatabase;
import edu.najah.cap.designpattern.factory.bad.PostgreeDatabase;
import edu.najah.cap.designpattern.factory.bad.SQLiteDatabase;

public class Application {

    //Which SOLID principles are broken
    //OCP: Open-Closed Principle (OCP)
    //SRP: Single Responsibility Principle (SRP) : The class has more than one responsibility (i.e. executing the query and initializing the database)
    //DIP: Dependency Inversion Principle (DIP) : The class depends on concrete implementations of the Database interface
    public static void main(String[] args) {
        Database database = initializeDatabase("MySQLDatabase");
        database.execute("SELECT * FROM users");
    }
    public static Database initializeDatabase(String databaseName) {
        Database database = null;
        if (databaseName.equals("MySQLDatabase")){
            database = new MySQLDatabase();
        } else if (databaseName.equals("PostgreeDatabase")){
            database = new PostgreeDatabase();
        } else if (databaseName.equals("SQLiteDatabase")){
            database = new SQLiteDatabase();
        }
        return database;
    }
}
