package Multithreading.Locking.DeadLockExample;

import javax.print.attribute.standard.MediaSize;

class Pen {
     public synchronized void writeWithPenAndPaper(Paper paper){
         System.out.println(Thread.currentThread().getName() +" is using pen "+ this +" and trying to write");
            paper.finishedWriting();
     }
     public synchronized void fishedWriting(){
         System.out.println(Thread.currentThread().getName()+ " is finished using pen "+ this);
     }
}

 class Paper {
     public synchronized void writeWithPaperAndPen(Pen pen){
         System.out.println(Thread.currentThread().getName() +" is using paper "+ this +" and trying to write");
         pen.fishedWriting();
     }

     public synchronized void finishedWriting() {
         System.out.println(Thread.currentThread().getName()+ " is finished using paper " + this);
     }
 }

 class task1 implements Runnable{
     private Pen pen;
     private Paper paper;

     public task1(Pen pen, Paper paper){
         this.pen = pen;
         this.paper = paper;
     }

     @Override
     public void run() {
         pen.writeWithPenAndPaper(paper);
     }
 }
 class task2 implements Runnable{
     private Pen pen;
     private Paper paper;

     public task2(Pen pen, Paper paper){
         this.pen = pen;
         this.paper = paper;
     }

     @Override
     public void run() {
         synchronized (pen) {
             paper.writeWithPaperAndPen(pen);
         }
     }
 }

public class DeadLockExample{
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread thread1 = new Thread(new task1(pen, paper), "Thread 1");
        Thread thread2 = new Thread(new task2(pen, paper), "Thread 2");

        thread1.start();
        thread2.start();
    }
}