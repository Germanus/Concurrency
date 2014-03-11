package my.ilya.thinking;

/**
 * @author Kazakevich Ilya
 */
public class ThreadMessage implements Runnable{

    private static int taskNumber = 0;
    private final int id = taskNumber++;

    public ThreadMessage(){
        System.out.println("Start");
    }

    @Override
    public void run() {
        System.out.println("#" + id + " Message 1");
        Thread.yield();
        System.out.println("#" + id + " Message 2");
        Thread.yield();
        System.out.println("#" + id + " Message 3");
        Thread.yield();
        System.out.println("End");
    }
}
