package edu.najah.cap.designpattern.observer.exmaple2;

public class MobileApplication implements Observer {
        private int id;
        private int temperature;

        public MobileApplication(int id) {
            this.id = id;
        }

        public int getTemperature() {
            return temperature;
        }

        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        public void display() {
            System.out.println("Mobile Application: " + this.id +  " : " + temperature);
        }

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        display();
    }
}
