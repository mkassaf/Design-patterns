package edu.najah.cap.designpattern.adapter.good;

public class Client {

    public static void main(String[] args) {

        NewSystem newSystem = new NewSystemImpl();

        NewSystem newSystemAdpater = new NewSystemAdpater(new LegacySystem());

        accept(newSystem);
        accept(newSystemAdpater);//
    }

    public static void accept(NewSystem system) {
        Result result = system.getResult();
        System.out.println(result.getId());
        System.out.println(result.getName());
    }
}
