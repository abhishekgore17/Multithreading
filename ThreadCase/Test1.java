package ThreadCase;
//performng single task from single thread
class Test1 extends Thread
{
    @Override
    public void run() { //single task
        System.out.println(" Thread Task1");
    }

    public static void main(String[] args) {
        Test1 t = new Test1();//single thread
        t.start();
    }
}
