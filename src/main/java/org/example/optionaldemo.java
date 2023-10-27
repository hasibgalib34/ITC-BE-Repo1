package org.example;

import java.util.Locale;
import java.util.Optional;

public class optionaldemo {
//    public int adding(int x1,int x2)
//    {
//        return x1+x2;
//    }
    public optionaldemo(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        String name="anil";
        Optional<String> nam= Optional.ofNullable(name);
        if(nam.isEmpty())
        {
            System.out.println("cant do upper case");
        }
        else {
            System.out.println(name.toUpperCase());
        }

//        Adder a1=(x1,x2)->{return x1+x2;};
//        System.out.println(a1.add(20,30));
        Adder a1=optionaldemo::new;
        a1.add(22,33);
// create a method of adding two no
        
    }
}
