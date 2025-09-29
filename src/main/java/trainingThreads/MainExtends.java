package trainingThreads;

public class MainExtends extends Thread {
  @Override
  public void run() {
    // Code that will run in the separate thread
    for (int i = 1; i <= 5; i++) {
      System.out.println(Thread.currentThread().getName() + " - Count: " + i);
      try {
        Thread.sleep(500); // Sleep for 500ms
      }
      catch (InterruptedException e) {
        System.out.println("Thread interrupted");
      }
    }
  }

  public static void main(String[] args) {
    MainExtends thread1 = new MainExtends();
    MainExtends thread2 = new MainExtends();

    // Check if threads are alive before starting
    System.out.println("thread1 is alive: " + thread1.isAlive());
    System.out.println("thread2 is alive: " + thread2.isAlive());

    thread1.start(); // Start the first thread
    thread2.start(); // Start the second thread

    // Check if threads are alive after starting
    System.out.println("thread1 is alive: " + thread1.isAlive());
    System.out.println("thread2 is alive: " + thread2.isAlive());

    System.out.println("Main thread continues...");

    // Wait a bit and check again
    try {
      Thread.sleep(2000); // Wait 3 seconds
      System.out.println("\nAfter 2 seconds:");
      System.out.println("thread1 is alive: " + thread1.isAlive());
      System.out.println("thread2 is alive: " + thread2.isAlive());

      // Wait for threads to complete
      thread1.join();
      thread2.join();

      System.out.println("\nAfter threads complete:");
      System.out.println("thread1 is alive: " + thread1.isAlive());
      System.out.println("thread2 is alive: " + thread2.isAlive());
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
  }


}
