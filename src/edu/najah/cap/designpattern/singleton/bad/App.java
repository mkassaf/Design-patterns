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


        String str1 = "ABC";
        String str2 = "ABC";//String pool will point to the same object String str1 = "ABC";
        str2 += "D";//new location in String pool will be created with ABCD
        if (str1 == str2){
            System.out.println("Same object");
        } else {
            System.out.println("Different object");
        }
        if (str1.equals(str2)){
            System.out.println("Same object");
        } else {
            System.out.println("Different object");
        }

        Database database1 = new Database("127.0.0:44433/myDB");
        Database database2 = new Database("127.0.0:44433/myDB");

        if (database1 == database2){ // compare reference not the content
            System.out.println("1- Same object");
        } else {
            System.out.println("1- Different object");
        }

        if (database1.equals(database2)){ // compare reference not the content
            System.out.println("2- Same object");
        } else {
            System.out.println("2- Different object");
        }

        if (database1.equals(database1)){ // compare reference not the content
            System.out.println("3- Same object");
        } else {
            System.out.println("3- Different object");
        }

        if (database1.equals("String")){
            System.out.println("4- Same object");
        } else {
            System.out.println("4- Different object");
        }
        if (database1.equals(null)){
            System.out.println("4- Same object");
        } else {
            System.out.println("4- Different object");
        }

    }

    private static void callInAnewThread(String query) {
        Clinet clinet = new Clinet();//
        clinet.runQuery(query);
    }

}
