package java8;

import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<Integer> p=(i)->{return i<10;};
        System.out.println(p.test(11));

        Supplier<String> s=()->{
            return "Hi";
        };
        System.out.println(s.get());

        Consumer<String> c=(msg)->{
            System.out.println(msg);
        };
        c.accept("pls help");

        Function<String,String> f=(msg)->{
            return msg.toUpperCase(Locale.ROOT);
        };
        System.out.println(f.apply("Hasib"));
    }
}
