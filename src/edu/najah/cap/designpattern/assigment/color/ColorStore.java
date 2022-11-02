package edu.najah.cap.designpattern.assigment.color;

import java.util.HashMap;

import static edu.najah.cap.designpattern.assigment.color.Color.generateColorKey;

public class ColorStore {

    private static final HashMap<String, Color> colors = new HashMap<>();

    static {
        initialize();
    }

    public static Color getInstance(int red, int green, int blue){
        Color instance = null;
        if(!Color.isValidRange(red)|| !Color.isValidRange(green)||!Color.isValidRange(blue)){
            System.err.println("Invalid color param");
            return null;
        }
        String key = generateColorKey(red, green, blue);

        if (!colors.containsKey(key)){
            instance = ColorFactory.getInstance(red,green,blue);
            colors.put(key, instance);
        }
        return colors.get(key);
    }


    public static void initialize(){

        colors.put(generateColorKey(0,0,0), getInstance(0,0,0));
        colors.put(generateColorKey(255,255,255), getInstance(255,255,255));
        colors.put(generateColorKey(255,0,0), getInstance(255,0,0));
        colors.put(generateColorKey(0,255,0), getInstance(0,255,0));
        colors.put(generateColorKey(0,0,255), getInstance(0,0,255));


    }
}
