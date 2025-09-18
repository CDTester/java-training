package trainingFileHandling;

import java.io.*;
import java.util.Scanner;

public class Files {
  public String filePath;
  public String name;
  public String fileName;
  public File file;

  public Files(String name) {
    this.filePath = "./src/main/resources/";
    this.name = name;
    this.fileName = filePath.concat(name);
    this.file = new File(fileName);
  }


  public void doesExist() {
    if (this.file.exists()) {
      System.out.println("File '" + fileName + "' exists");
    }
    else {
      System.out.println("File " + fileName + " does not exist");
    }
  }

  public void createFile() {
    try {
      if (this.file.createNewFile()) {
        System.out.println("File '" + fileName + "' created successfully");
      }
      else {
        System.out.println("File '" + fileName + "' already exists");
      }
    }
    catch (Exception e) {
      System.out.println("An error occurred while creating the file: " + e.getMessage());
      e.printStackTrace();
    }
  }

  public void isReadable() {
    if (this.file.canRead()) {
      System.out.println("File '" + fileName + "' is readable");
    }
    else {
      System.out.println("File '" + fileName + "' is not readable");
    }
  }

  public void isWriteable() {
    if (this.file.canWrite()) {
      System.out.println("File '" + fileName + "' is writeable");
    }
    else {
      System.out.println("File '" + fileName + "' is not writeable");
    }
  }

  public void getName() {
    System.out.println("File name is '" + this.file.getName() + "'");
  }

  public void getAbsolutePath() {
    System.out.println("Absolute path of the file '" + this.name + "' is: " + this.file.getAbsolutePath());
  }

  public void getFileSize() {
    System.out.println("File size is '" + this.file.length() + "' Bytes.");
  }

  public void deleteFile() {
    if (this.file.delete()) {
      System.out.println("File '" + this.name + "' was deleted successfully.");
    }
    else {
      System.out.println("Failed to delete the file '" + this.name + "'.");
    }
  }

  public void writeToFile(String content) {
    try (FileWriter fileWriter = new FileWriter(this.file)) {
      fileWriter.write(content);
      System.out.println("Successfully wrote to the file '" + this.name + "'");
    }
    catch (Exception e) {
      System.out.println("An error occurred while writing to the file: " + e.getMessage());
      e.printStackTrace();
    }
  }

  public void appendToFile(String content) {
    try (FileWriter fileWriter = new FileWriter(this.file, true)) {
      fileWriter.append(content);
      System.out.println("Successfully appended to the file '" + this.name + "'");
    }
    catch (Exception e) {
      System.out.println("An error occurred while appending to the file: " + e.getMessage());
      e.printStackTrace();
    }
  }

  public void readBufferedToFile() {
    try (BufferedReader reader = new BufferedReader(new FileReader(this.file))) {
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
      System.out.println("Successfully read the file '" + this.name + "'");
    }
    catch (Exception e) {
      System.out.println("An error occurred while reading to the file: " + e.getMessage());
      e.printStackTrace();
    }
  }

  public void writeBufferedFile(String[] content, boolean append) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.file, append))) {
      for (String line : content) {
        bw.write(line);
        bw.newLine();  // add line break
      }
      System.out.println("Successfully wrote to the file.");
    }
    catch (IOException e) {
      System.out.println("Error writing file.");
    }
  }

  public void readScannerFile() {
    try (Scanner myReader = new Scanner(this.file)) {
      String line;
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
    }
    catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  public void readFileInputStream() {
    try (FileInputStream input = new FileInputStream(this.file)) {
      int byteData;
      while ((byteData = input.read()) != -1) {
        System.out.print((char) byteData);
      }
      System.out.println();
    }
    catch (Exception e) {
      System.out.println("Error: An I/O error occurred. " + e);
    }
  }

  public void writeFileOutputStream(String content) {
    try (FileOutputStream output = new FileOutputStream(this.file)) {
      output.write(content.getBytes());
      System.out.println("Successfully wrote to the file '" + this.name + "'");
    }
    catch (Exception e) {
      System.out.println("An error occurred while writing to the file: " + e.getMessage());
      e.printStackTrace();
    }
  }

  public void writeFileOutputStream(String content, boolean append) {
    try (FileOutputStream output = new FileOutputStream(this.file, append)) {
      output.write(content.getBytes());
      System.out.println("Successfully wrote to the file '" + this.name + "'");
    }
    catch (Exception e) {
      System.out.println("An error occurred while writing to the file: " + e.getMessage());
      e.printStackTrace();
    }
  }

  public void copyFile() {
    File destFile = new File(this.filePath + "copied_" + this.file.getName());
    destFile.delete();

    try (FileInputStream input = new FileInputStream(this.file);
         FileOutputStream output = new FileOutputStream(destFile)) {

      int bytesRead;
      while ((bytesRead = input.read()) != -1) {
        output.write(bytesRead);
      }
      System.out.println("File copied successfully to " + this.filePath);
    }
    catch (IOException e) {
      System.out.println("An error occurred while copying the file: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
