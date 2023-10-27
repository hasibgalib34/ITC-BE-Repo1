package org.example;
//Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10
public class ThreadProirity implements Runnable {
    @Override
    public void run() {
        //System.out.println(ThreadDemo.currentThread().getName());
        for(int i=1;i<=5;i++)
        {
            System.out.println(i + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadProirity tp=new ThreadProirity();
        Thread t1=new Thread(tp,"One");
        ThreadProirity tp1=new ThreadProirity();
        Thread t2=new Thread(tp1,"Two");
        t1.setPriority(3);
        t2.setPriority(7);
        t1.start();
        t2.start();
    }

}
