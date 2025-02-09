package Methods;

public class Test extends Thread
{
    public void run()
    {
        System.out.println("Thread task : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Hello : " + Thread.currentThread().getName());

        Test t1 = new Test();
        t1.start();

        Test t2 = new Test();
        t2.start();

    }
}
