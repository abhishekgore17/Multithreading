package Methods.Daemon;

public class Test  extends Thread
{
    @Override
    public void run() {
        System.out.println("Child Thread ");
    }

    public static void main(String[] args) {
        System.out.println("Main Thread");
        Test t = new Test();
        t.setDaemon(true);
        t.start();
    }
}
