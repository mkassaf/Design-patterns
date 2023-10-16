package edu.najah.cap.designpattern.singleton.good;

public class Database {

    private String url;
    private Boolean status;

    private static Database database = null;

    private Database(String url) {
        status = false;
        this.url = url;
        connect(this.url);
    }

    //synchronized to make sure only one thread can access this method at a time
    public static  Database getInstance(String url) {
        //if no object created yet, create new object and return it
        //else return the existing object
        if (database == null) {
            //Double check locking
            synchronized (Database.class) {
                if (database == null) {
                    database =  new Database(url);
                }
            }
        }
        return database;
    }

    /**
     * Fake -- wait for 5 seconds
     * @param url
     */
    public void connect(String url) {
        System.out.println("Connecting .... ");
        try {
            Thread.sleep(5000);//wait for 5 seconds
            this.status = true;
        } catch (Exception e){
            System.err.println(e);
            this.status = false;
        }
        System.out.println("Connected!");
    }

    public Boolean getStatus() {
        return status;
    }

    public Object executeQuery(String query){
        if (!this.status){
            connect(this.url);
        }
        System.out.println("Executing query: " + query);
        return "This is the result";
    }
    @Override
    public boolean equals(Object obj) { // accepts Object of any type
        if (obj != null && this == obj) {
            return true;
        }
        if (!(obj instanceof Database)) {
            return false;
        }
        Database database = (Database) obj;
        if( this.url.equals(database.url)) {
            return true;
        }
        return false;
    }


}
