package Multithreading.Synchronisation;

public class Counter {
private int count = 0;

public void increment(){
    synchronized (this){
        // Critical Section.
        count++;
    }
}
public int getCount(){
    return count;
}
}
