package trainingFileHandling;

import java.io.File;
import java.io.FileWriter;

public class Files {
  public String name;
  public String fileName;
  public File file;

  public Files(String name) {
    String filePath = "./src/main/resources/";
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

  public void getAbsolutePath() {
    System.out.println("Absolute path of the file '" + this.name + "' is: " + this.file.getAbsolutePath());
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


}
