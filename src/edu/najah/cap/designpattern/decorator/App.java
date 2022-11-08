package edu.najah.cap.designpattern.decorator;

import edu.najah.cap.designpattern.decorator.component.Drink;
import edu.najah.cap.designpattern.decorator.concrete.Tea;
import edu.najah.cap.designpattern.decorator.decorator.Honey;
import edu.najah.cap.designpattern.decorator.decorator.Milk;

public class App {

    public static void main(String[] args) {

        Tea tea = new Tea();
        System.out.println(tea.getDescription());
        System.out.println(tea.cost());

        Milk teaWithMilk = new Milk(tea);
        System.out.println(teaWithMilk.getDescription());
        System.out.println(teaWithMilk.cost());

        Drink teaWithMilkWithHoney = new Honey(teaWithMilk);
        System.out.println(teaWithMilkWithHoney.getDescription());
        System.out.println(teaWithMilkWithHoney.cost());

        Drink teaWithMilkWithHoneyWithMilk = new Milk(teaWithMilkWithHoney);
        System.out.println(teaWithMilkWithHoneyWithMilk.getDescription());
        System.out.println(teaWithMilkWithHoneyWithMilk.cost());

    }
}
