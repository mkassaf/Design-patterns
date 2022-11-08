package edu.najah.cap.designpattern.test;

public class Child extends Parent {

    public Child() {
        super("");
    }

    public Child(String name) {
        super(name);
    }

    public Child(String name, int id) {
        super(name);

    }


    @Override
    public String getName() {
        System.out.println("getting name from child");

        String name = super.getName();

        return name;
    }
}
