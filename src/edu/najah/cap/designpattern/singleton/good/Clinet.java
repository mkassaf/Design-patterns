package edu.najah.cap.designpattern.singleton.good;

public class Clinet {

    private static final String DATABASE_URL = "127.0.0:44433/myDB";
    private Database database = null;
    private static String statuse = "Not connected";

    private int id;
    public void runQuery(String query) {
        database = Database.getInstance(DATABASE_URL);
        database.executeQuery(query);
    }


}
