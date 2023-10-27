package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Product> p= Arrays.asList(new Product("sugar",60),new Product("salt",45));
       // Collections.sort(p);
        p.forEach(p1-> System.out.println(p1.getName()+p1.getPrice()));
        NameComparator nc=new NameComparator();
        Collections.sort(p,nc);
        p.forEach(p1-> System.out.println(p1.getName()+p1.getPrice()));
    }
}
