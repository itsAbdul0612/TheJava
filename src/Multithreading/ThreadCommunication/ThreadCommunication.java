package Multithreading.ThreadCommunication;

class SharedResource {
    private int data;
    private boolean hasData;

    public synchronized void produce(int value){
        while (hasData){
            try {
                wait();
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
//        System.out.println("Produce: " + value);
        notify();
    }
    public synchronized int consume(){
        while (!hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        notify();
        return data;
    }
}

class Producer implements Runnable{
    SharedResource resource = new SharedResource();

    Producer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
           for (int i = 0; i < 10; i++){
         resource.produce(i);
            System.out.println("Produced: "+ i);
        }
    }
}

class Consumer implements Runnable{
    SharedResource resource = new SharedResource();
    Consumer(SharedResource resource){
        this.resource = resource;
    }
    @Override
    public void run() {
        for (int i = 0; i<10; i++){
           int value = resource.consume();
            System.out.println("Consumed: "+ value);
        }
    }
}
public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}