package trainingFileHandling;

public class Main {

  public static void main(String[] args) {
    System.out.println("FILE");
    Files myFile = new Files("myFile.txt");

    System.out.println("exists(): Tests whether the file exists.");
    myFile.doesExist();

    System.out.println("\ncreateNewFile(): Creates an empty file.");
    myFile.createFile();
    myFile.doesExist();

    System.out.println("\ncanRead(): Tests whether the file is readable.");
    myFile.isReadable();

    System.out.println("\ncanWrite(): Tests whether the file is writeable.");
    myFile.isWriteable();

    System.out.println("\ngetName(): Returns the name of the file.");
    myFile.getName();

    System.out.println("\ngetAbsolutePath(): Returns the absolute pathname of the file.");
    myFile.getAbsolutePath();

    System.out.println("\nlength(): Returns the size of the file in bytes.");
    myFile.getFileSize();

    System.out.println("\nlist(): Returns an array of the files in the directory.");

    System.out.println("\nmkdir(): Creates a directory.");

    System.out.println("\ndelete(): deletes a file.");
    Files anotherFile = new Files("anotherFile.txt");
    anotherFile.createFile();
    anotherFile.doesExist();
    anotherFile.deleteFile();
    anotherFile.doesExist();


    separator();
    System.out.println("There are classes that can be used to write files in Java:");
    System.out.println("FileWriter - easiest choice for basic text files.");
    System.out.println("BufferedWriter - better for larger files, as it writes data in chunks and supports handy features");
    System.out.println("FileOutputStream - best for writing binary data, such as images or videos.");

    System.out.println("\nFILE WRITER");
    System.out.println("write(): FileWriter's write() method is used to write data to the file. This will overwrite the existing content in the file.");
    myFile.writeToFile("Files in Java might be tricky, but it is fun enough!\n");

    System.out.println("\nwrite(): When FileWriter(fileName, true) is constructed, the write() method will append to the existing content in the file.");
    myFile.appendToFile("Let's add this line to the file.\n");

    System.out.println("\nFILE OUTPUT STREAM");
    System.out.println("This class is used for writing binary data (images, audio, PDFs) or when you need full control of raw bytes.");
    System.out.println("write(): Writes bytes from the specified byte array to this file output stream. string is converted to bytes using getBytes() method.");
    System.out.println("The bytes need to be converted to characters using (char)byteData.");
    Files myOutputStreamFile = new Files("fileOutputStream.txt");
    myOutputStreamFile.writeFileOutputStream("Hello World!\n");
    System.out.println("\nwrite(): When FileOutputStream(fileName, true) is constructed, the write() method will append to the existing content in the file.");
    myOutputStreamFile.writeFileOutputStream("Hello Moon!\n", true);

    System.out.println("\nBUFFERED WRITER");
    System.out.println("This class makes writing faster by using a buffered memory.");
    System.out.println("write() and newLine(): The write method adds text, and you can use newLine to insert a line break");
    Files myBufferedWriterFile = new Files("bufferedWriter.txt");
    String[] contents = {"Hello World!", "This is a new line.", "This is another line."};
    myBufferedWriterFile.writeBufferedFile(contents, false);


    separator();
    System.out.println("There are classes that can be used to read files in Java:");
    System.out.println("Scanner - best for basic text and when you want to parse numbers or words easily.");
    System.out.println("FileReader - This one is not so popular, because BufferedReader is usually preferred.");
    System.out.println("BufferedReader - best for large text files, because it is faster and reads line by line");
    System.out.println("FileInputStream - best for binary data (images, audio, PDFs) or when you need full control of raw bytes");

    System.out.println("\nSCANNER");
    System.out.println("nextLine(): Scanner's nextLine() method is used to read data from the file line by line. A while loop is used to read the whole file.");
    Files myScannerFile = new Files("scanner.txt");
    myScannerFile.readScannerFile();
    myScannerFile.getFileSize();

    System.out.println("\nFILE INPUT STREAM");
    System.out.println("This class is used for reading binary data (images, audio, PDFs) or when you need full control of raw bytes.");
    System.out.println("read(): Reads a byte of data from this input stream. Returns the next byte of data, or -1 if the end of the file is reached.");
    System.out.println("The bytes need to be converted to characters using (char)byteData.");
    Files myInputStreamFile = new Files("fileInputStream.txt");
    myInputStreamFile.readFileInputStream();

    System.out.println("\nUsing FileInputStream, we can copy a binary file, such as an image and write it to another file.");
    Files imageFile = new Files("java.jpg");
    imageFile.copyFile();

    System.out.println("\nBUFFERED READER");
    System.out.println("This class makes reading faster by using a buffered memory.");
    System.out.println("readLine(): Reads text line by line. A while loop is used to read the whole file.");
    Files myBufferedReaderFile = new Files("bufferedReader.txt");
    myBufferedReaderFile.readBufferedToFile();

    separator();


  }

  public static void separator() {
    System.out.println("------------------------------------------------------------------------------------------------\n");
  }

}

