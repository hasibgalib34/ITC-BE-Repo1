package org.example;

public class ThreadJoinMethod extends Thread{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
       ThreadJoinMethod t1=new ThreadJoinMethod();
       ThreadJoinMethod t2=new ThreadJoinMethod();
       t1.start();
       t1.join(); // maker t1 to complete so t2 get picked up after that
       // t1.join(2000) t2 get picked after 2 sec of t1 running
       t2.start();
    }
}
