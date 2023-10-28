package edu.najah.cap.designpattern.template.exmaple2;

public class Application {

    public static void main(String[] args) {
        Beverages tea = new Tea();
        Beverages coffee = new Coffee();

        tea.makeBeverage();
        coffee.makeBeverage();


    }
}
