package org.example;

public class SleepOnMainThread {
    public static void main(String[] args) throws InterruptedException {
        for(int i=1;i<5;i++)
        {
            System.out.println(i);
            Thread.sleep(2000);
        }
    }
}
