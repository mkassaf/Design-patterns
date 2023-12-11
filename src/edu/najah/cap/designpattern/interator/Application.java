package edu.najah.cap.designpattern.interator;

import java.util.*;

public class Application {

    public int id;

    Application(int id){
        this.id = id;
    }
    public static void main(String[] args) {

        Application[] apps = new Application[5];

        List<Application> appList = new LinkedList<>();

        Set<Application> applicationSet = new HashSet<>();

        for(int i = 0; i < 5; i++){
            apps[i] = new Application(i);
            appList.add(apps[i]);
            applicationSet.add(apps[i]);
        }

        for (int i = 0; i < apps.length; i++) {
            System.out.println(apps[i].id);
        }

        for (Application app : apps) {
            System.out.println(app.id);
        }

        read(appList);

        read(applicationSet);


    }


    public static void read(Iterable<Application> applicationSet){
        for (Application app : applicationSet) {
            System.out.println(app.id);
        }
    }
}
