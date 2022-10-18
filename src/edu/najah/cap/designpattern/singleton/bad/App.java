package edu.najah.cap.designpattern.singleton.bad;

import java.util.Date;
import java.util.List;

public class App {



    public static void main(String[] args) {
        Date start = new Date();
        List<String> queries = List.of(
                "select * from info",
                "select id from user",
                "select * from jobs",
                "select * from user");


        for (String query : queries) {//4
            callInAnewThread(query);
        }
        Date end = new Date();
        System.out.println((end.getTime() - start.getTime())/1000);//20 seconds
    }

    private static void callInAnewThread(String query) {
        Clinet clinet = new Clinet();//
        clinet.runQuery(query);
    }

}
