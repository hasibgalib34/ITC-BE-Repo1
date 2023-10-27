package org.example;
// is a thread provided by JVM as a support to user thread when all user thread terminated at the end this also gets ter
// if there is no user thread there would not be daemon thread as well
// we can make some user thread as Daemon with follwoing example
public class DaemonThread extends Thread{
    public void run()
    {
       if(Thread.currentThread().isDaemon())
       {
           System.out.println("I am Daemon");
       }
       else{
           System.out.println("I am user Thread");
       }
    }

    public static void main(String[] args) {
        DaemonThread t1=new DaemonThread();
        DaemonThread t2=new DaemonThread();
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
