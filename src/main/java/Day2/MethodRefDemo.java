package Day2;

public class MethodRefDemo {
    public static int cal(int x,int y)
    {
        return x+y;
    }
    public int cal1(int a,int b)
    {
        return a+b;
    }
    MethodRefDemo()
    {
        System.out.println("Hello From Constructor");
    }
    public static void main(String[] args) {
      Adder a= MethodRefDemo::cal; // static method ref
      Adder a11=new MethodRefDemo()::cal1; // instance method ref
        System.out.println(a.add(20,30));

        System.out.println(a11.add(22,33));
// Messagable m=MethodRefDemo::new;// cons ref
//        m.message();
        MethodRefDemo m=new MethodRefDemo();
    }
}
