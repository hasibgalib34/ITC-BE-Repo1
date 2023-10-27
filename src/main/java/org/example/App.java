package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
       new ThreadImpl("1st");

      new ThreadImpl("2nd");




        System.out.println( "Hello World!" );
    }
}
