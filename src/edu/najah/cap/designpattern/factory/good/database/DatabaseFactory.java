package edu.najah.cap.designpattern.factory.good.database;


public class DatabaseFactory {

    public static Database createInstance(DatabaseType type) {
        Database database = null;
        if (type.equals(DatabaseType.MySQLDatabase)) {
            database = new MySQLDatabase();
        } else if (DatabaseType.PostgreeDatabase.equals(type)){
            database = new PostgreeDatabase();
        } else if (DatabaseType.SQLiteDatabase.equals(type)){
            database = new SQLiteDatabase();
        }
        return database;
    }
}
