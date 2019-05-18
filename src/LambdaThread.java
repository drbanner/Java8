public class LambdaThread {


    public static void main(String[] args)
    {
        Runnable runnable = () -> {

            for (int i =1;i<=10;i++)
            {
                System.out.println("Lambda thread: "+i);
            }
        };
            Thread thread = new Thread(runnable);
            thread.start();
        for (int i =1;i<=10;i++)
        {
            System.out.println("Main thread: "+i);
        }
    }
}
