package edu.najah.cap.designpattern.singleton.contractor;

public class App {
    public static void main(String[] args) {
        MyClass myClass = MyClass.getInstance();
        MyClass myClass2 =MyClass.getInstance(5);
    }

}
