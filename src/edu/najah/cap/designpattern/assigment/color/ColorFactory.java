package edu.najah.cap.designpattern.assigment.color;

import static edu.najah.cap.designpattern.assigment.color.Color.generateColorKey;

public class ColorFactory {

    protected static Color getInstance(int red, int green, int blue){
        Color instance = null;

        if (red == 0 && green ==0 && blue == 0){
            Color black = new Color(0,0,0);

            //inline class
            black.setColorPrinter(new ColorPrinter() {
                @Override
                public void print() {
                    System.out.println("Black");
                }
            });
            return black;
        }
        if (red == 255 && green ==255 && blue == 255){
            Color white = new Color(0,0,0);

            white.setColorPrinter(() -> {
                System.out.println("White");
            });
            return white;
        }
        if (red == 0 && green ==0 && blue == 255){
            Color color = new Color(0,0,255);
            color.setColorPrinter(new BluePrinter());
            return color;
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
