package org.example;

public class ThreadDemo extends Thread {

    public void run()   {

        System.out.println("Thread call "+ Thread.currentThread().getName());

        for(int i=0;i<=5;i++)
        {

            System.out.println(i+" Of "+ Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo t1=new ThreadDemo();
        ThreadDemo t2=new ThreadDemo();
        t1.setName("First");
        t2.setName("Second");
        t1.start();
        t2.start();


    }
}
