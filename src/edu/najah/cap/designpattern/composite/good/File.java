package edu.najah.cap.designpattern.composite.good;

public class File implements  FileSystem{


    private int size;
    private String name;

    public File(int size, String name) {

        this.size = size;
         this.name = name;
    }



    public int getSize() {
        return size;
    }

    @Override
    public void printName() {
        System.out.print(this.name);
    }


}
