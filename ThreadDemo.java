// Define a class that extends the Thread class
class MyThread extends Thread {

    // Implement the run() method that will be executed when the thread starts
    public void run() {
        try {
            // Sleep for 2 seconds
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Thread is running");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        // Create a new instance of the MyThread class
        MyThread myThread = new MyThread();

        // Start the thread
        myThread.start();

        // Check if the thread is alive
        if (myThread.isAlive()) {
            System.out.println("Thread is still alive");
        } else {
            System.out.println("Thread is not alive");
        }

        // Wait for the thread to finish
        try {
            myThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        // Check if the thread is alive again
        if (myThread.isAlive()) {
            System.out.println("Thread is still alive");
        } else {
            System.out.println("Thread is not alive");
        }
    }
}
