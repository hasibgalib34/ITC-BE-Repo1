package org.example;

public class ConcurrencyPrblem implements Runnable{
    public static int amount=0;
    public static void main(String[] args) {
       ConcurrencyPrblem cm=new ConcurrencyPrblem();
       Thread t=new Thread(cm);
       t.start();
       while(t.isAlive())
       {
           System.out.println("waiting ...");
       }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    @Override
    public void run() {
      amount++;
    }
}
