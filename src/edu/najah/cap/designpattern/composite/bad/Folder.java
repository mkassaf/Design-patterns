package edu.najah.cap.designpattern.composite.bad;

import java.util.ArrayList;

public class Folder {

    /**
     * Depends on concrete
     */
    private ArrayList<Folder> folders;
    private ArrayList<File> files;


    public Folder(){
        folders = new ArrayList<>();
        files = new ArrayList<>();
    }

    public int getSize() {
        int size = 0;
        for (Folder folder : folders) {
            size += folder.getSize();
        }
        for (File file : files) {
            size += file.getSize();
        }
        return size;
    }

    public void addFolder(Folder folder) {
        folders.add(folder);
    }

    public void addFile(File file) {
        files.add(file);
    }

}
