package Multithreading.Volatile_Vs_Atomic;


class SharedObj{
    private volatile boolean flag = false;

    public void setFlahTrue(){
        System.out.println("Writer thread made the flag true.");
        flag = true;
    }
    public void ifFlagIsTrue(){
        while (!flag){
            //Do Nothing...
        }
        System.out.println("Flag is true");
    }
}
public class VolatileExample {
    public static void main(String[] args) {
        SharedObj sharedObj = new SharedObj();

        Thread writerThread = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie){
                Thread.currentThread().interrupt();
            }

            sharedObj.setFlahTrue();

        });
        Thread readerThread = new Thread(()-> sharedObj.ifFlagIsTrue());

        writerThread.start();
        readerThread.start();


    }
}
