package Methods;

public class Test1 extends Thread
{
    public void run()
    {
        System.out.println("Thread task : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Hello : " + Thread.currentThread().getName());

        Test1 t1 = new Test1();
        t1.setName("Abhishek ");
        t1.start();

        Test1 t2 = new Test1();
        t2.setName("Smart programming ");
        t2.start();

        System.out.println(Thread.currentThread().isAlive());

    }
}