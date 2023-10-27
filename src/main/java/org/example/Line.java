package org.example;
// example of synchronised method
public class Line {
    synchronized public void getLine() throws InterruptedException {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
            Thread.sleep(2000);
        }
    }
}
