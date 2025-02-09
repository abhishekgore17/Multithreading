package ThreadCase;
//performing multiple task from multiple thread
class Test3 extends Thread
{
    @Override
    public void run() {
        System.out.println("Thread task 3");
    }
}
class Test4 extends Thread
{
    @Override
    public void run() {
        System.out.println("Thread task 4");
    }
}
class main
{
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.start();

        Test4 th = new Test4();
        th.start();
    }
}