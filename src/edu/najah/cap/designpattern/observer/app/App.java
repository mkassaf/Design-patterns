package edu.najah.cap.designpattern.observer.app;

import edu.najah.cap.designpattern.observer.observer.Book;
import edu.najah.cap.designpattern.observer.observer.Student;
import edu.najah.cap.designpattern.observer.subject.ISubject;
import edu.najah.cap.designpattern.observer.subject.Subject;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Subject bookCount = new Subject();


        Student student = new Student(subject);
        Book book = new Book();
        Book book2 = new Book();
        //subject.registerObserver(student);//Student object register itself to Subject
        subject.registerObserver(book);//Book object register itself to Subject
        subject.registerObserver(book2);//Book object register itself to Subject

        subject.setValue(0);//Both should be notified

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter value");
            int value = scanner.nextInt();
            subject.setValue(value);


            System.out.println("subject.value " + subject.getValue());
            System.out.println("student.value " + student.getValue());
            System.out.println("book.value " + book.getValue());
            System.out.println("book2.value " + book2.getValue());


            if (value == 0){
                //exit
                break;
            }
            
        }





    }


}
