package org.example;
// t1 became the normal object not the thread object so there would be no context switching
public class CallDirectRunMethod extends Thread {
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
       CallDirectRunMethod c=new CallDirectRunMethod();
        CallDirectRunMethod c1=new CallDirectRunMethod();
       c.run();
       c1.run();
    }
}
