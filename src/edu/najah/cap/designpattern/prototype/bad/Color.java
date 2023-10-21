package edu.najah.cap.designpattern.prototype.bad;

public class Color implements Cloneable{
    private int red;
    private int green;
    private int blue;

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

    public Color copy(){
        Color copy =  new Color(this);
        return copy;
    }


    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof Color)) {
            return false;
        }
        Color color = (Color) object;
        return this.red == color.getRed() && this.green == color.getGreen() && this.blue == color.getBlue();
    }



}
