package edu.najah.cap.designpattern.assigment.color;

import static edu.najah.cap.designpattern.assigment.color.Color.generateColorKey;

public class ColorFactory {

    public static Color getInstance(int red, int green, int blue){
        Color instance = null;

        if (red == 0 && green ==0 && blue == 0){
            return new Black();
        }
        if (red == 0 && green ==0 && blue == 255){
            return new Blue();
        }
        if (red == 0 && green ==255 && blue == 0){
            return new Green();
        }



        return new Color(red, green, blue);
    }
}
