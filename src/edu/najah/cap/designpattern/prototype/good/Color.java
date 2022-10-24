package edu.najah.cap.designpattern.prototype.good;

public class Color implements Cloneable{
    private int red;
    private int green;
    private int blue;

    static {
        System.out.println("I am scaning Color class");
    }
    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Color(Color color){
        this.red = color.red;
        this.green = color.green;
        this.blue = color.blue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
    @Override
    public String toString(){
        return this.red + ", " + this.green + " ," + this.blue;
    }

    @Override
    public Object clone(){
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e){
            System.err.println(e.getMessage());
        }
        return object;

    }


}
