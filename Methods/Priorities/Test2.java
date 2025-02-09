package Methods.Priorities;

public class Test2 extends Thread {
    public void run(){
        System.out.println("Child Thread");
        System.out.println("Child Thread priority : "+ Thread.currentThread().getPriority());

    }
    public static void main(String[] args) {
        System.out.println("Main Thread old priority : "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Main Thread New priority : "+Thread.currentThread().getPriority());
        Test2 t = new Test2();
        //t.setPriority(3);
        t.start();
    }
}
