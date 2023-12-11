package edu.najah.cap.designpattern.assnment3.observer;

public class StatisticsDisplay implements Observer {
    @Override
    public void update(String status) {
        sendStatistics(status);
    }

    private void sendStatistics(String status) {
        System.out.println("StatisticsDisplay \n" + status);
    }
}
