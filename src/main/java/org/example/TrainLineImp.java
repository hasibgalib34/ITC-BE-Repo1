package org.example;

public class TrainLineImp {
    public static void main(String[] args) {
        Line l=new Line();
        Train t1=new Train(l,"One");
        Train t2=new Train(l,"Two");
        t1.start();
        t2.start();
    }
}
