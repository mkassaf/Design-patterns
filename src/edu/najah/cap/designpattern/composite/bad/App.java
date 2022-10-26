package edu.najah.cap.designpattern.composite.bad;

public class App {

    public static void main(String[] args) {

        /*

        FileSystem -> File or Folder
        Folder -> contains list of files or folders
        getSize
            - File return its size
            - Folder returns size of it's folders and files


         */

        Folder sub2 = new Folder();

        sub2.addFile(new File(8));

        Folder sub1 = new Folder();

        sub2.addFile(new File(10));
        sub2.addFile(new File(5));

        Folder root = new Folder();

        root.addFolder(sub1);
        root.addFolder(sub2);
        root.addFile(new File(5));

        System.out.println(root.getSize());






    }
}
