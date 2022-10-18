package edu.najah.cap.designpattern.singleton.bad;

public class Clinet {

    private static final String DATABASE_URL = "127.0.0:44433/myDB";
    private Database database = null;
    private static String statuse = "Not connected";

    private int id;
    public void runQuery(String query) {
        System.out.println("Prepare for query " + query);
        System.out.println("Status :: " + statuse);
        if (database == null){
            database = new Database(DATABASE_URL);
            statuse = "Connected";
        }
        database.executeQuery(query);
    }


}
