package edu.najah.cap.designpattern.decorator.example.usingInhertance;

public class Application {

    public static void main(String[] args) {

        printBill(new Tea());
        printBill(new Coffee());
        printBill(new TeaMilk());
        printBill(new CoffeeWithMilk());
        printBill(new TeaWithMilkWithHonny());
        printBill(new TeaWithMilkWithMilk());
        //TeaWithMilkWithHonnyWithMilk

    }


    public static void printBill(Bevrage bevrage) {
        System.out.println("Cost: " + bevrage.getCost());
        System.out.println("Description: " + bevrage.getDescription());
    }
}
