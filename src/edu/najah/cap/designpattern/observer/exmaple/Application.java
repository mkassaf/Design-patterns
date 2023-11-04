package edu.najah.cap.designpattern.observer.exmaple;

import java.util.Scanner;

public class Application {



    public static void main(String[] args) {
        /*
        The window object should be updated whenever a new message is added to the channel
        The printer object should be updated whenever a new message is added to the channel
        List of window object should be updated whenever a new window object is added to the channel
         */
        Window window = new Window("1");
        Window window2 = new Window("2");
        Channel channel = new Channel();
        Email email = new Email();


        Printer printer = new Printer();

        window2.subscribe(channel);
        window.subscribe(channel);
        window.subscribe(email);

        channel.subscribe(printer);

        addInitialMessage(channel, window, "Hello World");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your message: ");
            String message = scanner.nextLine();
            if (message.equals("exit")) {
                break;
            }
            channel.addMessage(message);
        }

        email.send("Thank you");

    }


    public static void addInitialMessage(Channel channel, Window window, String message) {
        channel.addMessage(message);
    }
}
