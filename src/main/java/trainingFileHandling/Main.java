package trainingFileHandling;

public class Main {

  public static void main(String[] args) {
    System.out.println("FILE");
    Files myFile = new Files("myFile.txt");

    System.out.println("\nexists(): Tests whether the file exists.");
    myFile.doesExist();

    System.out.println("\ncreateNewFile(): Creates an empty file.");
    myFile.createFile();
    myFile.doesExist();

    System.out.println("\ncanRead(): Tests whether the file is readable.");
    myFile.isReadable();

    System.out.println("\ncanWrite(): Tests whether the file is writeable.");
    myFile.isWriteable();

    System.out.println("\ngetName(): Returns the name of the file.");

    System.out.println("\ngetAbsolutePath(): Returns the absolute pathname of the file.");
    myFile.getAbsolutePath();

    System.out.println("\nlength(): Returns the size of the file in bytes.");

    System.out.println("\nlist(): Returns an array of the files in the directory.");

    System.out.println("\nmkdir(): Creates a directory.");

    separator();
    System.out.println("FILE WRITER");

    System.out.println("\nwrite(): FileWriter's write() method is used to write data to the file. This will overwrite the existing content in the file.");
    myFile.writeToFile("Files in Java might be tricky, but it is fun enough!\n");

    System.out.println("\nappend(): FileWriter's append() method is used to write data to the file. This will append to the existing content in the file.");


    separator();
    System.out.println("FILE READER");


    separator();
    System.out.println("\ndelete(): Deletes the file.");


    separator();


  }

  public static void separator() {
    System.out.println("------------------------------------------------------------------------------------------------\n");
  }

}

