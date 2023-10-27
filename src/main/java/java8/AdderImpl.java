package java8;

public class AdderImpl {
    public static void main(String[] args) {
        Adder a=(a1,b1)->{
            return a1+b1;
        };

        System.out.println(a.add(22,23));
    }
}
