package ThreadCase;
// performing single task from multiple thread
class Testt extends Thread
{
    @Override
    public void run() {
        System.out.println("Thread task2");
    }

    public static void main(String[] args) {
        Testt t = new Testt();
        t.start();

        Testt t1 = new Testt();
        t1.start();

        Testt t2 = new Testt();
        t2.start();
    }
}
