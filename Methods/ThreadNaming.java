package Methods;
//Thread Naming methods : getName(), setName()
public class ThreadNaming
{
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Abhishek");
        System.out.println("New Thread Name : "+Thread.currentThread().getName());
        System.out.println(10/0);
    }
}
