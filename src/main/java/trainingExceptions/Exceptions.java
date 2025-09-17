package trainingExceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Exceptions {

  public void arrayOutOfBounds() {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    }
    catch (Exception e) {
      System.out.println("Something went wrong: " + e);
    }
    finally {
      System.out.println("The 'try catch' is finished.");
    }
  }

  public void arithmeticException() {
    try {
      int result = 10 / 0;
      System.out.println("The result is: " + result);
    }
    catch (Exception e) {
      System.out.println("Error: Cannot divide by zero. " + e);
    }
  }

  public void StringToInt() {
    String str = "123a";
    try {
      int num = Integer.parseInt(str);
      System.out.println("The number is: " + num);
    }
    catch (Exception e) {
      System.out.println("Error: Cannot convert string to integer. " + e);
    }
  }

  public void classNotFound() {
    try {
      Class.forName("NonExistentClass");
    }
    catch (Exception e) {
      System.out.println("Error: Class not found. " + e);
    }
  }

  public void fileNotFound() {
    try {
      BufferedReader reader = new BufferedReader(new FileReader("non_existent_file.txt"));
      String line = reader.readLine();
      System.out.println(line);
      reader.close();
    }
    catch (Exception e) {
      System.out.println("Error: File not found. " + e);
    }
  }

  public void ioException() {
    try {
      FileWriter writer = new FileWriter("./src/main/resources/readOnly.txt");
      writer.write("Hello, World!");
      writer.close();
      System.out.println("Successfully wrote to the file.");
    }
    catch (Exception e) {
      System.out.println("Error: An I/O error occurred. " + e);
    }
  }

  public void tryWithResources() {
    try (FileOutputStream output = new FileOutputStream("./src/main/resources/writeTryWithResources.txt")) {
      output.write("Hello".getBytes());
      // no need to call close() here
      System.out.println("Successfully wrote to the file.");
    }
    catch (Exception e) {
      System.out.println("Error: An I/O error occurred. " + e);
    }
  }

  public void inputMismatch() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an String when it should be an integer: ");
    try {
      int number = scanner.nextInt();
      System.out.println("You entered: " + number);
    }
    catch (Exception e) {
      System.out.println("Error: Invalid input. Please enter an integer. " + e);
    }
    finally {
      scanner.close();
    }
  }

  public void stringIndexOutOfBounds() {
    try {
      String str = "Hello";
      char ch = str.charAt(10); // This will throw an exception
      System.out.println("Character at index 10: " + ch);
    }
    catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }

  public void nullPointer() {
    try {
      String str = null;
      System.out.println(str.length()); // This will throw an exception
    }
    catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }

  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  static void multiCatch() {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
      int result = 10 / 0;
    }
    catch (ArithmeticException e) {
      System.out.println("Error: Cannot divide by zero. " + e);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: Array index is out of bounds. " + e);
    }
    catch (Exception e) {
      System.out.println("Error: Something went wrong. " + e);
    }
  }


}
