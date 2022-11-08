package edu.najah.cap.designpattern.test;

public class Parent {

    private String name;

    public Parent(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("getting name from parent");
        return name;
    }
}
