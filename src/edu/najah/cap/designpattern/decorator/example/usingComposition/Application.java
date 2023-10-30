package edu.najah.cap.designpattern.decorator.example.usingComposition;

import edu.najah.cap.designpattern.decorator.example.usingComposition.extra.Express;
import edu.najah.cap.designpattern.decorator.example.usingComposition.extra.Milk;
import edu.najah.cap.designpattern.decorator.example.usingComposition.main.Tea;

public class Application {

    public static void main(String[] args) {

        Tea tea = new Tea();

        System.out.println(tea.getDescription());
        System.out.println(tea.getCost());

        Milk Milk = new Milk(tea);



        System.out.println(Milk.getDescription());
        System.out.println(Milk.getCost());

        Milk Milk2 = new Milk(Milk);

        System.out.println(Milk2.getDescription());
        System.out.println(Milk2.getCost());


        Express express = new Express(Milk2);

        System.out.println(express.getDescription());
        System.out.println(express.getCost());

        Express express2 = new Express(express);
        System.out.println(express2.getDescription());
        System.out.println(express2.getCost());

    }
}
