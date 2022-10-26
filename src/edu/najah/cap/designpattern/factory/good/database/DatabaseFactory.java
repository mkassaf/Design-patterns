package edu.najah.cap.designpattern.factory.good.database;


public class DatabaseFactory {

    public static Database createInstance(String databaseName) {
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
