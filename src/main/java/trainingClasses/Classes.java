package trainingClasses;

import java.util.Scanner;

import trainingExceptions.Classes2;

public class Classes {
  public int x;
  public int y;
  private int z;
  public final int finalInt = 13;
  static int staticInt = 15;

  public Classes() {
    this.x = 5;
    this.z = 26;
  }

  public Classes(int consY) {
    this(); // this calls the constructor which has x defined as 5
    this.y = consY;
  }

  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  public int getPrivate() {
    return this.z;
  }

  public void setPrivate(int newValue) {
    this.z = newValue;
  }

  public void getInput() {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter name");
    String userName = myObj.nextLine();
    System.out.println("Hello " + userName);
  }

  public void callSecondPackage() {
    Classes2 myObj = new trainingExceptions.Classes2();
  }
}


abstract class People {
  public String fname;
  public int age;

  public abstract void abstractMethod();

  public void normalMethod() {
    System.out.println("This is a normal method in abstract class People.");
  }
}

class Student extends People {
  public int abstractYear = 2025;

  public Student(String firstName, int age) {
    this.fname = firstName;
    this.age = age;
  }

  public void abstractMethod() {
    System.out.println("Abstract: abstractMethod is a method that can only be used in the subClass Student of Abstract class People!");
  }
}

class Vehicle {
  protected String brand = "Ford";         // Vehicle attribute
  private int productionYear = 2020;       // This attribute can not be accessed by subclass Car
  protected String colour = "Black";

  public Vehicle() {
    System.out.println("Vehicle constructor called, this is the parent class of Car.");
  }

  public void honk() {                     // Vehicle method
    System.out.println("This cars horn sounds like:");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute
  private String hornSound = "Beep, Beep!";
  private String colour = "Red";

  public Car() {
    super();
    System.out.println("Car constructor called, this is the child class of Vehicle.");
  }

  public void newCar() {
    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(super.brand + " " + this.modelName);
  }

  public void honk() {
    super.honk(); // Call the honk() method from the Vehicle class (the super class of Car)
    System.out.println(this.hornSound);
  }

  public void displayColour() {
    System.out.println("Colour of Vehicle class = " + super.colour); // Vehicle class attribute
    System.out.println("Colour of Car class = " + this.colour); // Car class attribute
  }


}

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class OuterClass {
  int x = 10;
  int a = new PrivateInnerClass().z;

  class InnerClass {
    int y = 5;
  }

  private class PrivateInnerClass {
    int z = 3;
  }

  static class StaticInnerClass {
    int w = 7;
  }
}

interface Electronics {
  int voltage = 220;

  void powerOn();

  void powerOff();
}

interface Tv {
  // all methods in interface are abstract (only method names, no body)
  void turnOn();

  void turnOff();

  void changeChannel(int channel);
}

class SmartTv implements Tv {
  public void turnOn() {
    System.out.println("The TV is on");
  }

  public void turnOff() {
    System.out.println("The TV is off");
  }

  public void changeChannel(int channel) {
    System.out.println("Channel changed to: " + channel);
  }
}

class NonSmartTv implements Tv, Electronics {
  public void powerOn() {
    System.out.println("Powering On with voltage: " + voltage);
  }

  public void turnOn() {
    System.out.println("The TV is on");
  }

  public void changeChannel(int channel) {
    System.out.println("Channel changed to: " + channel);
  }

  public void turnOff() {
    System.out.println("The TV is off");
  }

  public void powerOff() {
    System.out.println("Powering Off");
  }
}

enum Level {
  LOW,
  MEDIUM,
  HIGH;
}

enum Level2 {
  // Enum constants (each has its own description)
  LOW("Low level"),
  MEDIUM("Medium level"),
  HIGH("High level");

  // Field (variable) to store the description text
  private String description;

  // Constructor (runs once for each constant above)
  private Level2(String description) {
    this.description = description;
  }

  // Getter method to read the description
  public String getDescription() {
    return description;
  }
}

