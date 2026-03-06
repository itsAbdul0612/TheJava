package Multithreading.Locking;

public class Test {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                    bank.withDraw(30);
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();

//        Reenterenttt reenterenttt = new Reenterenttt();
//
//        reenterenttt.innerMethod();

    }
}
