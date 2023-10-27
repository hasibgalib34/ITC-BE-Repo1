package Day2;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Anonymous  {
    public static void main(String[] args) {
        // anonymous class to overrride the abstract method of Functional Interface
        Messagable m=new Messagable() {
            @Override
            public void message() {
                System.out.println("Hello ITC batch");
            }
        };

        Messagable m1=()->{
            System.out.println("Hello ITC batch");
        };
        // adder imp thr anonymous class
        Adder a=new Adder() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };

        Adder a1=(a2,b2)->{
            return a2+b2;
        };

        Shape s=()->{
            System.out.println("draw rectangle");
        };
        Shape s1=()->{
            System.out.println("draw circle");
        };

        Predicate<Integer> p=(a3)->{return a3<11; };

        System.out.println(p.test(12));

        Supplier<String> s11=()->{return "ITC";};

        System.out.println(s11.get());

        Consumer<String> c=(name)->{
            System.out.println(name);
        };
        c.accept("Abradeep");

        Function<String,String> f1=(name)->{return "Hi"+ name;};
        System.out.println(f1.apply("Snehal"));

        String[] names={"sachin","saurav","rohit","virat"};
        List<String> namess= Arrays.asList("Ravi","Anil","Sunil");
        for(String name:names)
        {
            System.out.println(name);
        }
        namess.forEach(name->{
            System.out.println(name);
        });

        namess.forEach(name-> System.out.println(name));



    }
}
