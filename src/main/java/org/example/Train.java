package org.example;

public class Train extends Thread{
    Line l;
    public void run()
    {
        try {
            l.getLine();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    Train(Line l,String name)
    {
      this.l=l;
    }
}
