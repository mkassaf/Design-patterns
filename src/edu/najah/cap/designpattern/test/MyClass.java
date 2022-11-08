package edu.najah.cap.designpattern.test;

public class MyClass {

    public int x;
    public static int sx;


    public MyClass(int x) {
        this.x = x;
    }

    public static void fun(){
        System.out.println(sx);
    }

    @Override
    public String toString() {
        return String.valueOf(this.x);
    }
}
