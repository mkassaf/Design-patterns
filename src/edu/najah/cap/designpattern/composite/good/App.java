package edu.najah.cap.designpattern.composite.good;



public class App {

    public static void main(String[] args) {

        /*

        FileSystem -> File or Folder
        Folder -> contains list of files or folders (list of fileSystem)
        getSize
            - File return its size
            - Folder returns size of it's folders and files


         */
        Folder root = new Folder("root");

        Folder sub1 = new Folder("sub1");
        sub1.addFile(new File(10, "file 1"));

        Folder sub2 = new Folder("sub 2");
        sub2.addFile(new File(10, "file 2"));


        root.addFile(sub1);
        root.addFile(sub2);
        root.addFile(new File(5, "file 3"));


        root.printName();
        printSize(root);


    }

    private static void printSize(FileSystem fileSystem) {
        System.out.println("the size is : " + fileSystem.getSize());
    }


}
