package edu.najah.cap.designpattern.decorator;

import edu.najah.cap.designpattern.decorator.component.Drink;
import edu.najah.cap.designpattern.decorator.concrete.Coffee;
import edu.najah.cap.designpattern.decorator.concrete.Tea;
import edu.najah.cap.designpattern.decorator.decorator.Honey;
import edu.najah.cap.designpattern.decorator.decorator.Milk;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        makeOrder();

    }

    private static void makeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your order: ");
        String order = scanner.nextLine();
        Drink drink = null;
        if (order.equals("Tea")) {
            drink = new Tea();
        } else if (order.equals("Coffee")) {
            drink = new Coffee();
        }

        System.out.println("Please enter your additions: ");
        while (true) {

            String additions = scanner.nextLine();
            if (additions.equals("Milk")) {
                drink = new Milk(drink);
            } else if (additions.equals("Honey")) {
                drink = new Honey(drink);
            } else if (additions.equals("Done")) {
                break;
            }
            System.out.println("Do you need something else?");
        }

        System.out.println("Your order is: " + drink.getDescription());
        System.out.println("Your order cost is: " + drink.cost());


    }
}
