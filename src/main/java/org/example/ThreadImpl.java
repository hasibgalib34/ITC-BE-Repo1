package org.example;

public class ThreadImpl implements Runnable{
    Thread thread;
    String name;
    @Override
    public void run() {
      for(int i=0;i<5;i++)
      {
          System.out.println(thread.getName()+ i);
          try {
              Thread.sleep(5000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
    }

    public ThreadImpl(String name) throws InterruptedException {
        thread=new Thread(this,name);
        System.out.println(thread.getName());
        thread.start();
        //Thread.sleep(8000);
    }
}
