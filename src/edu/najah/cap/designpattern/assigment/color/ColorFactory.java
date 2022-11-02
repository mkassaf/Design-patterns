package edu.najah.cap.designpattern.assigment.color;

import static edu.najah.cap.designpattern.assigment.color.Color.generateColorKey;

public class ColorFactory {

    protected static Color getInstance(int red, int green, int blue){
        Color instance = null;

        if (red == 0 && green ==0 && blue == 0){
            return new Black();
        }
        if (red == 255 && green ==255 && blue == 255){
            return new White();
        }
        if (red == 0 && green ==0 && blue == 255){
            return new Blue();
        }
        if (red == 0 && green ==255 && blue == 0){
            return new Green();
        }
        if (red == 255 && green ==0 && blue == 0){
            return new Red();
        }

        return new Color(red, green, blue);
    }
}
