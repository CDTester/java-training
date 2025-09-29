package trainingThreads;

public class MainImplements implements Runnable {
  public static int amount = 0;

  public void run() {
    System.out.println("Thread is running using Runnable interface");
    amount++;
  }

  public static void main(String[] args) {
    MainImplements obj = new MainImplements();
    Thread thread = new Thread(obj);
    thread.start();
    // Wait for the thread to finish
    while (thread.isAlive()) {
      System.out.println("Waiting...");
    }
    // Update amount and print its value
    System.out.println("Main: " + amount);
    amount++;
    System.out.println("Main: " + amount);
  }


}
