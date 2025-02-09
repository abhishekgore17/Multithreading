package Methods.join;

public class join  extends Thread{
    public void run(){
        try
        {
            for(int i=1; i<=5; i++){
                System.out.println("Child Thread : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException
    {
        join t = new join();
        t.start();
        t.join();
        try
        {
            for(int i=1; i<=5; i++){
                System.out.println("Main Thread : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
