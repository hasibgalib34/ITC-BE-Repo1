package Day2;
@FunctionalInterface
public interface Messagable {
    public void message();
    default public void func1()
    {
        System.out.println("Hello");
    }
    public static void func2()
    {
        System.out.println("Good morning");
    }

}
