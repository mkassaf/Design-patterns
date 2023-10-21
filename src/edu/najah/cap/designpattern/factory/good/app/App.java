package edu.najah.cap.designpattern.factory.good.app;


import edu.najah.cap.designpattern.factory.good.database.Database;
import edu.najah.cap.designpattern.factory.good.database.DatabaseFactory;
import edu.najah.cap.designpattern.factory.good.database.DatabaseType;

import java.util.Scanner;

public class App {
    public static Database database = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the database name: ");
        String databaseName = scanner.next();
        database = DatabaseFactory.createInstance(DatabaseType.valueOf(databaseName));
        System.out.println("An object created from : " + database.getClass().getName());

        database.execute("select * ");
    }


}
