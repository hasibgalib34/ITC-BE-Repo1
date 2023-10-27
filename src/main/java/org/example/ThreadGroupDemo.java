package org.example;

public class ThreadGroupDemo extends Thread{
    public void run()
    {

    }

    public static void main(String[] args) {
        ThreadGroup tg1=new ThreadGroup("Group1");
        Thread t1=new Thread(tg1,"One");
        Thread t2=new Thread(tg1,"Two");
        ThreadGroup tg2=new ThreadGroup("Group2");
        Thread t3=new Thread(tg2,"Three");
        Thread t4=new Thread(tg2,"Four");
        t1.start();
        t2.start();

        System.out.println(tg1.activeCount());

    }
}
