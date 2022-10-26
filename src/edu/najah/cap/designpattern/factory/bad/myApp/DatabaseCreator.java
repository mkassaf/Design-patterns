package edu.najah.cap.designpattern.factory.bad.myApp;

import edu.najah.cap.designpattern.factory.bad.Database;
import edu.najah.cap.designpattern.factory.bad.MySQLDatabase;
import edu.najah.cap.designpattern.factory.bad.PostgreeDatabase;
import edu.najah.cap.designpattern.factory.bad.SQLiteDatabase;

public class DatabaseCreator {

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
