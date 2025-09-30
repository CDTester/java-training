package training;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Consumer;

interface MyLambdaInterface {
  String run(String str);
}

public class Main {

  public static void main(String[] args) {

    Fundamentals core = new Fundamentals();

    /* VARIABLES */
    Fundamentals.variables();

    /* DATA TYPES */
    Fundamentals.dataTypes();

    /* CASTING - assigning value of one primitive data type to another data type */
    Fundamentals.casting();

    /* OPERATORS - performs operations on variables */
    Fundamentals.operators();

    /* STRINGS - object that has methods */
    Fundamentals.strings();

    /* MATH - Class with methods */
    Fundamentals.maths();

    /* IF ELSE */
    Fundamentals.ifElse();

    /* TERNARY OPERATOR */
    Fundamentals.ternary();

    /* SWITCH */
    Fundamentals.switches(LocalDate.now());

    /* WHILE LOOP */
    Fundamentals.whileLoop();

    /* FOR LOOP */
    Fundamentals.forLoop();

    /* METHODS */
    System.out.println("\n");
    System.out.println("Method with parameter");
    Fundamentals.ageChecker(17);
    Fundamentals.ageChecker(18);
    Fundamentals.ageChecker(19);

    System.out.println("\n");
    System.out.println("Method with return value");
    System.out.println(Fundamentals.percentage(8, 60) + "%");
    System.out.println(Fundamentals.percentage(43, 60) + "%");

    System.out.println("\n");
    System.out.println("Method overloading");
    System.out.println(Fundamentals.add(60, 9));
    System.out.println(Fundamentals.add(60.36f, 9.33f));
    System.out.println(Fundamentals.add("60", "9"));

    /* RECURSION */
    System.out.println("\n");
    System.out.println("Method recursion");
    int recResult = Fundamentals.sum(15);
    System.out.println(" = " + recResult);
    int fact = 5;
    System.out.println("Factorial of " + fact + " is " + Fundamentals.factorial(fact));

    /*  REGEX */
    System.out.println("\n");
    System.out.println("REGEX");
    Fundamentals.regex("W3");
    Fundamentals.regex("skool");
    Fundamentals.regex("[abc]"); //Find one of these characters
    Fundamentals.regex("[a-z]"); //Find a character  in the range provided
    Fundamentals.regex("[a-z]*"); //Find a ranger of characters (up to non character value) in the range provided
    Fundamentals.regex("[^a-z]"); //Find a character NOT in the range provided
    Fundamentals.regex("^s"); //Find a character at the beginning of the string
    Fundamentals.regex("^v"); //Find a character at the beginning of the string
    Fundamentals.regex("n$"); //Find a character at the end of the string
    Fundamentals.regex("!$"); //Find a character at the end of the string
    Fundamentals.regex("[0-9]"); //Find a digit in the range provided
    Fundamentals.regex("\\d"); //Find a digit
    Fundamentals.regex("\\s"); //Find a whitespace character
    Fundamentals.regex("goto|w3schools"); //Find a match for ant one of the patterns separated by |


    /*  LAMBDA */
    System.out.println("\n");
    System.out.println("LAMBDA");
    System.out.println("Lambdas are often passed as arguments to methods. For example, you can use a lambda in the forEach() method of an ArrayList");
    var numbersLambda = new ArrayList<Integer>();
    numbersLambda.add(4);
    numbersLambda.add(2);
    numbersLambda.add(3);
    numbersLambda.add(1);
    numbersLambda.forEach((n) -> System.out.println(n));

    System.out.println("\nA lambda expression can be stored in a variable. The variable's type must be an interface with exactly one method (a functional interface).");
    System.out.println("The lambda must match that method's parameters and return type.");
    Consumer<Integer> method = (n) -> {
      System.out.println(n);
    };
    numbersLambda.forEach(method);

    System.out.println("\nYou can also pass a lambda expression to a method. The method's parameter must be a functional interface.");
    System.out.println("Calling the interface's method will then run the lambda expression.");
    MyLambdaInterface exclaim = (s) -> s + "!";
    MyLambdaInterface ask = (s) -> s + "?";
    printFormatted("Hello", exclaim);
    printFormatted("Hello", ask);


  }

  public static void printFormatted(String str, MyLambdaInterface format) {
    String result = format.run(str);
    System.out.println(result);
  }
}


