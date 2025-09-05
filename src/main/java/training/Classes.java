package training;

public class Classes {
  int x;
  int y;

  public Classes() {
    this.x = 5;
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


}
