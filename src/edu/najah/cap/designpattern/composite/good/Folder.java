package edu.najah.cap.designpattern.composite.good;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class Folder implements FileSystem {

    private String name;
    /**
     * Depends on concrete
     */
    private ArrayList<FileSystem> files;


    public Folder(String name){
        files = new ArrayList<>();
        this.name = name;
    }

    public int getSize() {
        int size = 0;
        for (FileSystem file : files) {
            size += file.getSize();
        }
        return size;
    }

    @Override
    public void printName() {
        System.out.println("Folder name is : " + this.name);
        for (FileSystem file : files) {
            file.printName();
        }
        System.out.println();
    }


    public void addFile(FileSystem file) {

        files.add(file);
    }

}
