package edu.najah.cap.designpattern.assnment3;

import edu.najah.cap.designpattern.assnment3.component.Weather;
import edu.najah.cap.designpattern.assnment3.concrete.Temperature;
import edu.najah.cap.designpattern.assnment3.decorator.RainPrecipitation;
import edu.najah.cap.designpattern.assnment3.decorator.WindSpeed;
import edu.najah.cap.designpattern.assnment3.observer.CurrentConditionsDisplay;
import edu.najah.cap.designpattern.assnment3.observer.Observer;
import edu.najah.cap.designpattern.assnment3.observer.StatisticsDisplay;
import edu.najah.cap.designpattern.assnment3.subject.ISubject;

public class Main {
    public static void main(String[] args) {

        Observer observer1 = new CurrentConditionsDisplay();
        Observer observer2 = new CurrentConditionsDisplay();
        Observer observer3 = new StatisticsDisplay();

        Weather temperatureWeather = new Temperature(20, "C");

        System.out.println(temperatureWeather.getStatus());

        System.out.println("--------------------------------------------------");

        Weather weatherWithWind = new WindSpeed(temperatureWeather, "10");

        System.out.println(weatherWithWind.getStatus());

        System.out.println("--------------------------------------------------");

        Weather weatherWithWindAndRain = new RainPrecipitation(weatherWithWind, "10", "Rain");

        System.out.println(weatherWithWindAndRain.getStatus());

        System.out.println("--------------------------------------------------");

        Weather weatherWithWindAndRainWithSnow = new RainPrecipitation(weatherWithWindAndRain, "10", "Snow");

        System.out.println(weatherWithWindAndRainWithSnow.getStatus());

        System.out.println("--------------------------------------------------");

        ISubject weatherWithWindAndRainWithSnowSubject = (ISubject) weatherWithWindAndRainWithSnow;
        ISubject weatherWithWindSubject = (ISubject) weatherWithWind;

        weatherWithWindAndRainWithSnowSubject.registerObserver(observer1);
        weatherWithWindSubject.registerObserver(observer2);
        weatherWithWindSubject.registerObserver(observer3);

        weatherWithWindAndRainWithSnow.setValue("50");
        weatherWithWind.setValue("40");

        weatherWithWindAndRainWithSnow.setValue("30");
        weatherWithWind.setValue("30");

        System.out.println("--------------------------------------------------");

    }
}
