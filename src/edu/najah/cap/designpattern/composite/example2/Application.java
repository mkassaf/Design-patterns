package edu.najah.cap.designpattern.composite.example2;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        User staff1 = new User("Ali", "IT", 5000);


        User staff2 = new User("Ahmad", "IT", 5000);
        User staff3 = new User("Mohammad", "IT", 5000);
        User staff4 = new User("Omar", "IT", 5000);
        User staff5 = new User("Khalid", "IT", 5000);
        User staff6 = new User("Abdullah", "IT", 5000);
        User staff7 = new User("Hassan", "IT", 5000);
        User staff8 = new User("Hussein", "IT", 5000);

        User manager1 = new Manager("Rami", "IT", 10000, List.of(staff1, staff2, staff3, staff4));

        User manager2 = new Manager("Ahmad", "IT", 10000, List.of(staff5, staff6, staff7, staff8, manager1));


        User staff9 = new User("Shada", "IT", 5000);


        User topManager = new Manager("Ahmad", "Top Management", 10000, List.of(manager2, staff9));

        topManager.giveDetails();

    }

}
