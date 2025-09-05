package training;


public class Main {

  public static void main(String[] args) {

    Fundamentals core = new Fundamentals();


    /* Class */
    System.out.println("\n");
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

    System.out.println("\nClass - Constructors. can overload constructor and use this to call another constructor.");
    Classes myConstructor = new Classes(8);
    System.out.println("Classes myConstructor.x = " + myConstructor.x);
    System.out.println("Classes myConstructor.y = " + myConstructor.y);

    System.out.println("\nClass - Modifiers");

  }


}
