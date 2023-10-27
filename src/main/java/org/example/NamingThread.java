package org.example;

public class NamingThread extends Thread{
    public void run()
    {
        System.out.println("running");
    }

    public static void main(String[] args) {
        NamingThread nt=new NamingThread();
        nt.start();
        System.out.println(nt.getName());
        nt.setName("First");
        System.out.println(nt.getName());
    }
}
