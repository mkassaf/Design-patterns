package edu.najah.cap.designpattern.adapter.bad;

public class Client {

    public static void main(String[] args) {

        NewSystem newSystem = new NewSystemImpl();

        accept(newSystem);
    }

    public static void accept(NewSystem system){
        Result result = system.getResult();
        System.out.println(result.getId());
        System.out.println(result.getName());
    }
}
