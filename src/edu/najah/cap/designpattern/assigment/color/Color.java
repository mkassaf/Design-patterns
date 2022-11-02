package edu.najah.cap.designpattern.assigment.color;

public class Color {
    private final int red;
    private final int green;
    private final int blue;



    protected Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        System.out.println("Creating " + this);
    }




    public static String generateColorKey(int red, int green, int blue) {
        StringBuilder key = new StringBuilder();
        key.append(red);
        key.append(":");
        key.append(green);
        key.append(":");
        key.append(blue);
        return key.toString();
    }



    public int getRed() {
        return red;
    }



    public int getGreen() {
        return green;
    }



    public int getBlue() {
        return blue;
    }



    public static boolean isValidRange(int range){
        return range >= 0 && range <= 255;
    }

    @Override
    public String toString(){
        return generateColorKey(this.red, this.green, this.blue);
    }

    public void print(){
        System.out.println(this);
    }

}
