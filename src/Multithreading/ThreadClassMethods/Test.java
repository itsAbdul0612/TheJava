package Multithreading.ThreadClassMethods;

public class Test extends Thread {

    @Override
    public void run() {
      for (int i =1; i < 10; i++){
          System.out.println(Thread.currentThread().getName()+ " is Running");
          Thread.yield();
      }
    }
    public static void main(String[] args) throws InterruptedException {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.start();
        t2.start();
    }
}


// With Yeild

//Thread-1 is Running
//Thread-0 is Running
//Thread-1 is Running
//Thread-1 is Running
//Thread-1 is Running
//Thread-1 is Running
//Thread-0 is Running
//Thread-1 is Running
//Thread-0 is Running
//Thread-1 is Running
//Thread-0 is Running
//Thread-1 is Running
//Thread-0 is Running
//Thread-1 is Running
//Thread-0 is Running
//Thread-0 is Running
//Thread-0 is Running
//Thread-0 is Running

//Without Yeild

//Thread-0 is Running
//Thread-1 is Running
//Thread-0 is Running
//Thread-1 is Running
//Thread-0 is Running
//Thread-1 is Running
//Thread-1 is Running
//Thread-0 is Running
//Thread-0 is Running
//Thread-0 is Running
//Thread-0 is Running
//Thread-0 is Running
//Thread-1 is Running
//Thread-0 is Running
//Thread-1 is Running
//Thread-1 is Running
//Thread-1 is Running
//Thread-1 is Running