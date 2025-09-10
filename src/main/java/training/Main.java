package training;


public class Main {

  public static void main(String[] args) {

    Fundamentals core = new Fundamentals();

    separator();

    /* Class */
    System.out.println("Class");
    Classes myObj = new Classes();
    System.out.println("Classes myObj.x = " + myObj.x);

    System.out.println("\nClass - changing attributes in one object does not affect the attribute in the second object");
    Classes myObj1 = new Classes();
    Classes myObj2 = new Classes();
    myObj1.x = 25;
    System.out.println("Classes myObj1.x = " + myObj1.x);
    System.out.println("Classes myObj2.x = " + myObj2.x);

    System.out.println("\nClass - Static");
    Classes.myStaticMethod(); // Call the static method

    System.out.println("\nClass - Public");
    // Classes.myPublicMethod(); This would compile an error
    Classes myPublicObj = new Classes(); // Create an object of Main
    myPublicObj.myPublicMethod(); // Call the public method on the object
    Classes myCar = new Classes();   // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method

    separator();

    System.out.println("Class - Constructors. can overload constructor and use this to call another constructor.");
    Classes myConstructor = new Classes(8);
    System.out.println("Classes myConstructor.x = " + myConstructor.x);
    System.out.println("Classes myConstructor.y = " + myConstructor.y);

    separator();

    System.out.println("Class - Access Modifiers");
    System.out.println("Public: So far we have used public modifiers, attributes/methods/constructors are available to all classes.");
    Classes myPrivateObj = new Classes();
    System.out.println("Private: Only accessible within the same class. Classes.z can only be accessed by a getter method getPrivate() = " + myPrivateObj.getPrivate());
    System.out.println("Protected: Code is accessible in the same package and subclasses. .... Complete this once learnt about packages!");

    System.out.println("\nClass - Non-Access Modifiers");
    //final, static, void
    Classes myModObj = new Classes();
    System.out.println("Final: Makes the variable a constant. myModObj.finalInt = " + myModObj.finalInt + "myModObj.finalInt = 23;  Will cause an error.");
    System.out.println("Static: Makes the variable/method accessible without crating an object. Classes.staticInt = " + Classes.staticInt);
    System.out.println("Abstract: An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:");
    Student myStudent = new Student("john", 24);
    System.out.println("Abstract: Name =  " + myStudent.fname);
    System.out.println("Abstract: Age =  " + myStudent.age);
    System.out.println("Abstract: graduation Year =  " + myStudent.abstractYear);
    myStudent.abstractMethod();

    separator();

    System.out.println("Class - Encapsulation, to ensure sensitive data is hidden from users by the use of getters and setters.");
    Classes myEncapObj = new Classes();
    System.out.println("Get: private variable Classes.z = " + myEncapObj.getPrivate());
    myEncapObj.setPrivate(36);
    System.out.println("Set: private variable to 36, Classes.z = " + myEncapObj.getPrivate());

    separator();

    System.out.println("Class - Packages, built-in.");
    System.out.println("This library is divided into packages and classes. You can either import a single class, or a whole package that contain all the classes.");
    System.out.println("Import Class: import java.util.Scanner.");
    Classes imp = new Classes();
    imp.getInput();

    System.out.println("\nClass - Packages, User-defined.");
    System.out.println("Import Package: import trainingSecondPackage.*");
    imp.callSecondPackage();

    separator();

    System.out.println("Class - Inheritance (Subclass and Superclass)");
    System.out.println("\nSuperclass: Call Parent class constructor");
    Car myCarObj = new Car();

    System.out.println("\nSubclass: Child of class. Inherits from it's parent.");
    System.out.println("Car class is a subclass of Vehicle class and can inherit attribute 'brand' and method 'honk'.");
    myCarObj.newCar();

    System.out.println("\nSuperclass: Parent of class. the class being inherited from.");
    myCarObj.honk();  // this calls honk method from Car class, which calls super.honk() to access Vehicle class honk method.

    System.out.println("\nSuperclass: Accessing parent attributes");
    System.out.println("Vehicle class has attribute colour = 'Black', Car class has an attribute colour = 'Red'.");
    myCarObj.displayColour();

    separator();

    System.out.println("Class - Polymorphism.");
    System.out.println("Polymorphism uses inherited methods to perform different tasks. This allows us to perform a single action in different ways.");
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();

    separator();
    System.out.println("Class - Inner.");
    System.out.println("The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.");
    System.out.println("To access the inner class, create an object of the outer class, and then create an object of the inner class:");
    OuterClass myOuter = new OuterClass();   // Create an object of the outer class
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println("myInner.y = " + myInner.y + "; myOuter.x = " + myOuter.x + "; The sum of these values = " + (myInner.y + myOuter.x));
    System.out.println("\nInner classes can also be private or protected to hide them from other classes. PrivateInnerClass cannot be accessed outside of OuterClass.");
    OuterClass.StaticInnerClass myStaticInner = new OuterClass.StaticInnerClass();
    System.out.println("\nInner classes can also be static, you can access them without creating an object, myStaticInner.w = " + myStaticInner.w);

    separator();
    System.out.println("Class - Abstraction.");

  }

  public static void separator() {
    System.out.println("------------------------------------------------------------------------------------------------\n");
  }


}

