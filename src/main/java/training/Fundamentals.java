package training;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Fundamentals {
  @SuppressWarnings("all")
  public Fundamentals() {
    /* VARIABLES */
    variables();

    /* DATA TYPES */
    dataTypes();

    /* CASTING - assigning value of one primitive data type to another data type */
    casting();

    /* OPERATORS - performs operations on variables */
    operators();

    /* STRINGS - object that has methods */
    strings();

    /* MATH - Class with methods */
    maths();

    /* IF ELSE */
    ifElse();

    /* TERNARY OPERATOR */
    ternary();

    /* SWITCH */
    switches(LocalDate.now());

    /* WHILE LOOP */
    whileLoop();

    /* FOR LOOP */
    forLoop();

    /* METHODS */
    System.out.println("\n");
    System.out.println("Method with parameter");
    ageChecker(17);
    ageChecker(18);
    ageChecker(19);

    System.out.println("\n");
    System.out.println("Method with return value");
    System.out.println(percentage(8, 60) + "%");
    System.out.println(percentage(43, 60) + "%");

    System.out.println("\n");
    System.out.println("Method overloading");
    System.out.println(add(60, 9));
    System.out.println(add(60.36f, 9.33f));
    System.out.println(add("60", "9"));

    /* RECURSION */
    System.out.println("\n");
    System.out.println("Method recursion");
    int recResult = sum(15);
    System.out.println(" = " + recResult);
    int fact = 5;
    System.out.println("Factorial of " + fact + " is " + factorial(fact));

  }

  static void variables() {
    String name = "Chris";
    int numberCoffee = 2;
    float coffeePrice = 5.99F;
    char currency = '£';
    boolean hasMilk = false;
    final int maxNumberCoffee = 10;

    System.out.println(name + " has " + numberCoffee + " coffee(s). With Milk?: " + hasMilk);
    System.out.println("The total cost is " + currency + numberCoffee * coffeePrice);
  }

  static void dataTypes() {
    // Primitive - cannot be null
    byte a = 127;                // -128                       to 127
    short b = -32768;            // -32,768                    to 32,768
    int c = 2147483647;          // -2,147,483,648             to 2,147,483,647
    long d = 2147483648L;        // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float e = 0.1234567F;        // fractional numbers to 7 dp
    float se = 1234567e-7F;      // scientific notation of a float
    double f = 0.1234567890D;    // fractional numbers to 16 dp
    double sf = 1234567890e-10F; // scientific notation of a float
    boolean g = true;            // true or false
    char h = 'B';                // single char
    char ascii = 66;             // ascii value for B

    System.out.println();
    System.out.println("Variable - Primitive");
    System.out.println("byte = " + a);
    System.out.println("short = " + b);
    System.out.println("int = " + c);
    System.out.println("long = " + d);
    System.out.print("float = " + e);
    System.out.println("; scientific notation float = " + se);
    System.out.print("double = " + f);
    System.out.println("; scientific notation double = " + sf);
    System.out.println("boolean = " + g);
    System.out.println("char = " + h);
    System.out.println("ascii char = " + ascii);

    // Non-Primitive
    // reference types, they refer to objects. Can be null
    String i = "array of chars";
    int[] arrInt = {1, 2, 3, 4};
    String[] arrStr = {"a", "b", "c", "d"};

    System.out.println();
    System.out.println("Variable - Non-Primitive");
    System.out.println("String = " + i);
    System.out.println("int[] = " + Arrays.toString(arrInt));
    System.out.println("String[] = " + Arrays.toString(arrStr));
  }

  static void casting() {
    // Widening
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println();
    System.out.println("Casting - Widening");
    System.out.println("int = " + myInt + " ; cast to double = " + myDouble);

    // Narrowing
    double myDoubleN = 9.78d; // Automatic casting: int to double
    int myIntN = (int) myDoubleN;

    System.out.println();
    System.out.println("Casting - Narrowing");
    System.out.println("double = " + myDoubleN + " ; cast to int = " + myIntN);

  }

  static void operators() {
    int hundred = 100;
    System.out.println();
    System.out.println("Operators - Arithmetic");
    System.out.println("Addition:  100 + 40 = " + (hundred + 40));
    System.out.println("Subtraction:  100 - 40 = " + (hundred - 40));
    System.out.println("Multiplication:  100 * 40 = " + ((double) hundred * 40));
    System.out.println("Division:  100 / 40 = " + ((double) hundred / 40));
    System.out.println("Modulus:  100 % 40 = " + ((double) hundred % 40));
    System.out.println("Increment:  100 ++ = " + (++hundred));
    System.out.println("Decrement:  100 + 40 = " + (--hundred));

    int five = 5;
    System.out.println();
    System.out.println("Operators - Assignment");
    System.out.println("=:  int five = " + (five));
    System.out.println("+=:  five += 4 = " + (five += 4));
    System.out.println("-=:  five -= 4 = " + (five -= 4));
    System.out.println("*=:  five *= 4 = " + (five *= 4));
    System.out.println("/=:  five /= 4 = " + (five /= 4));
    System.out.println("%=:  five %= 4 = " + (five %= 4));
    System.out.println("&=:  five &= 4 = " + (five &= 4));
    System.out.println("|=:  five |= 4 = " + (five |= 4));
    System.out.println("^=:  five ^= 4 = " + (five ^= 4));
    System.out.println(">>=:  five >>= 4 = " + (five >>= 4));
    System.out.println("<<=:  five <<= 4 = " + (five <<= 4));

    int six = 6;
    System.out.println();
    System.out.println("Operators - Comparison");
    System.out.println("Equal:  6 == 6 = " + (six == 6));
    System.out.println("Not Equal:  6 != 6 = " + (six != 6));
    System.out.println("Greater than:  6 > 8 = " + (six > 8));
    System.out.println("Less than:  6 < 4 = " + (six < 4));
    System.out.println("Greater than or equal:  6 >= 6 = " + (six >= 6));
    System.out.println("Less than or equal:  6 <= 5 = " + (six <= 5));

    System.out.println();
    System.out.println("Operators - Logical");
    System.out.println("AND:  6 > 0 && 6 < 10 = " + (6 > 0 && 6 < 10));
    System.out.println("OR:  6 > 0 || 6 < 5 = " + (6 > 0 && 6 < 10));
    System.out.println("NOT:  !(6 > 0 && 6 < 10) = " + (!(6 > 0 && 6 < 10)));
  }

  static void strings() {
    String words = "PlEaSe locate WhErE 'locate' %s %,d!     ";
    System.out.println();
    System.out.println("Strings - Methods");
    System.out.println("words = " + words);
    System.out.println("Length:  words.length() = " + words.length());
    System.out.println("toLowerCase:  words.toLowerCase() = " + words.toLowerCase());
    System.out.println("toUpperCase:  words.toUpperCase() = " + words.toUpperCase());
    System.out.println("IndexOf:  words.indexOf(\"locate\") = " + words.indexOf("locate"));
    System.out.println("LastIndexOf:  words.lastIndexOf(\"locate\") = " + words.lastIndexOf("locate"));
    System.out.println("CharAt:  words.charAt(17) = " + words.charAt(17));
    System.out.println("Concat:  words.concat(\" Locate.\") = " + words.concat(" Locate."));
    System.out.println("Contains:  words.contains(\"!\") = " + words.contains("!"));
    System.out.println("EndsWith:  words.endsWith(\"S\") = " + words.endsWith("."));
    System.out.println("StartsWith:  words.startsWith(\"P\") = " + words.startsWith("P"));
    System.out.println("Format:  String.format(words, \"occurs\", 123456789) = " + String.format(words, "occurs", 123456789));
    System.out.println("IsEmpty:  words.isEmpty() = " + words.isEmpty());
    System.out.println("Join:  String.join(words, \" \", \"occurs \") = " + String.join(words, " ", "occurs "));
    System.out.println("replace:  words.replace(\"locate\", \"replace\") = " + words.replace("locate", "replace"));
    System.out.println("split:  words.split([!\\ \\s]) = " + Arrays.toString(words.split("[! \\s]")));
    System.out.println("substring:  words.substring(15, 3) = " + words.substring(15, 18));
    System.out.println("trim:  words.trim() = " + words.trim());
  }

  static void maths() {
    System.out.println();
    System.out.println("Math - Methods");
    System.out.println("abs = Math.abs(9) = " + Math.abs(-41));
    System.out.println("min = Math.min(5, 10) = " + Math.min(5, 10));
    System.out.println("min = Math.max(5, 10) = " + Math.max(5, 10));
    System.out.println("random = Math.random() = " + Math.random());
    System.out.println("sqrt = Math.sqrt(9) = " + Math.sqrt(9));
    System.out.println("cbrt = Math.cbrt(9) = " + Math.cbrt(27));
    System.out.println("ceil = Math.ceil(2.1) = " + Math.ceil(2.1));
    System.out.println("floor = Math.floor(2.1) = " + Math.floor(2.1));
    System.out.println("round = Math.round(2.5) = " + Math.round(2.5));
  }

  static void ifElse() {
    System.out.println();
    System.out.println("If, Else If, Else");
    LocalTime time = LocalTime.now();
    System.out.println(time);
    if (time.getHour() < 12) {
      System.out.println("Good Morning");
    }
    else if (time.getHour() >= 12 && time.getHour() < 18) {
      System.out.println("Good Afternoon");
    }
    else {
      System.out.println("Good Evening");
    }
  }

  static void ternary() {
    System.out.println();
    System.out.println("Ternary Operator");
    System.out.println("variable = (condition) ? expressionTrue :  expressionFalse;");
    LocalTime time = LocalTime.now();
    String work = time.getHour() < 17 ? "Keep working!" : "You can log off now!";
    System.out.println(work);
  }

  static void switches(LocalDate day) {
    System.out.println();
    System.out.println("Switch Statement");
    switch (day.getDayOfWeek()) {
      case MONDAY:
        System.out.println("Happy Monday");
        break;
      case TUESDAY:
        System.out.println("Happy Tuesday");
        break;
      case WEDNESDAY:
        System.out.println("Happy Wednesday");
        break;
      case THURSDAY:
        System.out.println("Happy Thursday");
        break;
      case FRIDAY:
        System.out.println("Happy Friday");
        break;
      default:
        System.out.println("Happy Weekend");
    }
  }

  static void whileLoop() {
    System.out.println();
    System.out.println("While Loop");
    int whileI = 0;
    while (whileI < 5) {
      System.out.print("while loop " + whileI + "; ");
      whileI++;
    }

    System.out.println();
    System.out.println("Do While Loop");
    int doWhileI = 10;
    System.out.println("Do while variable is less than 10");
    do {
      System.out.println("variable is " + doWhileI);
      doWhileI++;
    }
    while (doWhileI < 10);
  }

  static void forLoop() {
    System.out.println();
    System.out.println("For Loop");
    for (int forX = 1; forX <= 3; forX++) {
      System.out.print(forX + " times table:  ");
      for (int forY = 1; forY <= 3; forY++) {
        int res = forX * forY;
        System.out.print(forX + "x" + forY + "= " + res + "; ");
      }
      System.out.print("\n");
    }

    System.out.println();
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println("For Each Loop: cars = " + Arrays.toString(cars));
    for (String make : cars) {
      System.out.print(make + ", ");
    }
    System.out.print("\n");

    System.out.println();
    System.out.println("For Loop: 0-6, continue on 2 and break on 4 = ");
    for (int forbc = 0; forbc < 6; forbc++) {
      if (forbc == 2) {
        continue;
      }
      if (forbc == 4) {
        break;
      }
      System.out.print(forbc + ", ");
    }
  }

  static void ageChecker(int age) {
    if (age < 18) {
      System.out.println("Access denied - At " + age + ", you are not old enough!");
    }
    else {
      System.out.println("Access granted - At " + age + ", you are old enough!");
    }
  }

  static double percentage(int x, int y) {
    return ((double) x / y) * 100;
  }

  static int add(int x, int y) {
    return x + y;
  }

  static float add(float x, float y) {
    return x + y;
  }

  static String add(String x, String y) {
    return x + y;
  }

  static int sum(int x) {
    if (x > 0) {
      System.out.print(x);
      if (x - 1 > 0) {
        System.out.print(" + ");
      }
      return x + sum(x - 1);
    }
    else {
      System.out.print(x);
      return x;
    }
  }

  static int factorial(int n) {
    if (n > 1) {
      return n * factorial(n - 1);
    }
    else {
      return 1;
    }
  }

}
