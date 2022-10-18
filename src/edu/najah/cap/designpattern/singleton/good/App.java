package edu.najah.cap.designpattern.singleton.good;

import java.util.Date;
import java.util.List;

public class App {



    public static void main(String[] args) throws InterruptedException {
        Date start = new Date();
        List<String> queries = List.of(
                "select * from info",
                "select id from user",
                "select * from jobs",
                "select * from user");


        for (int i=0; i<5; i++ ){

            for (String query : queries) {//4
                new Thread(() -> {
                    callInAnewThread(query);
                }).start();
            }

            Thread.sleep(6000);//
        }






        Date end = new Date();
        System.out.println((end.getTime() - start.getTime())/1000);//20 seconds
    }

    private static void callInAnewThread(String query) {
        Clinet clinet = new Clinet();//
        clinet.runQuery(query);
    }

}
