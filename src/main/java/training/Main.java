package training;

import java.time.LocalDate;

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


  }

}

