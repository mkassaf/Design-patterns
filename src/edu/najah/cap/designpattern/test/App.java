package edu.najah.cap.designpattern.test;

public class App {


    public static void main(String[] args) {


        Parent parent = new Parent("p1");
        Parent child = new Child("c1");
        Child child2 = new Child("c1");


        System.out.println(parent.getName());//
        System.out.println(child.getName());
        System.out.println(child2.getName());



        MyClass.sx = 100;
        MyClass.fun();


        System.out.println(MyClass.sx);//100

        MyClass o1 = new MyClass(1);//x
        o1.fun();
        o1.sx = 200;
        System.out.println(o1.sx);//200
        System.out.println(MyClass.sx);//200

        MyClass o2 = new MyClass(2);//x
        MyClass o3 = new MyClass(3);//x
        MyClass o4 = new MyClass(4);//x


        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);


    }
}
