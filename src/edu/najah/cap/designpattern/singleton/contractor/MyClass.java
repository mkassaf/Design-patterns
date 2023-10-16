package edu.najah.cap.designpattern.singleton.contractor;

public class MyClass {
    private MyClass() {
        System.out.println("MyClass object created");
    }
    private MyClass(int i) {
        System.out.println("MyClass object created with int value");
    }

    public static MyClass getInstance() {
        return new MyClass();
    }

    public static MyClass getInstance(int i) {
        return new MyClass(i);
    }
}
