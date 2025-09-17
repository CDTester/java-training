package trainingExceptions;

public class Main {

  public static void main(String[] args) {
    System.out.println("EXCEPTIONS. Use try/catch/finally to catch exceptions during runtime.");

    Exceptions myException = new Exceptions();
    System.out.println("\nArrayIndexOutOfBoundsException: Occurs when trying to access an index number that does not exist in an array");
    myException.arrayOutOfBounds();

    System.out.println("\nNumberFormatException: Occurs when it is not possible to convert a specified string to a numeric type");
    myException.StringToInt();

    System.out.println("\nArithmeticError: Occurs when a numeric calculation goes wrong");
    myException.arithmeticException();

    System.out.println("\nClassNotFoundException: Occurs when trying to access a class that does not exist");
    myException.classNotFound();

    System.out.println("\nFileNotFoundException: Occurs when a file cannot be accessed");
    myException.fileNotFound();

    System.out.println("\nIOException: Occurs when an input or output operation fails");
    myException.ioException();

    System.out.println("\nInputMismatchException: Occurs when entering wrong input (e.g. text in a numerical input)");
    myException.inputMismatch();

    System.out.println("\nStringIndexOutOfBoundsException: Occurs when trying to access a character in a String that does not exist");
    myException.stringIndexOutOfBounds();

    System.out.println("\nNullPointerException: Occurs when trying to access an object reference that is null");
    myException.nullPointer();

    separator();
    System.out.println("THROW. This statement is used to create a custom error. ");

    System.out.println("\nArithmeticException: In this example we throw an error if age is below 18.");
    try {
      myException.checkAge(15);  // Set age to 15 (which is below 18...)
    }
    catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }

    separator();
    System.out.println("Multiple Catch Blocks. You can use multiple catch blocks to handle different types of exceptions:");
    myException.multiCatch();

    separator();
    System.out.println("Try With Resources is a special form of try that works with resources (like files and streams). \nThe resource is declared inside parentheses try(...), and Java will close it automatically when the block finishes - even if an error occurs.");
    myException.tryWithResources();


  }


  public static void separator() {
    System.out.println("------------------------------------------------------------------------------------------------\n");
  }
}