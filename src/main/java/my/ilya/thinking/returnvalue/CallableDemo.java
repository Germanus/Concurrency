package my.ilya.thinking.returnvalue;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @author KAZAKEVICH
 */
class TaskWithResult implements Callable<String> {

    private int id;
    public TaskWithResult(int id){
        this.id = id;
    }
    @Override
    public String call() throws Exception {
        return "result of TaskWithResults " + id;
    }
}

public class CallableDemo {
    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results =
                new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++) {
            results.add(exec.submit(new TaskWithResult(i)));
        }
        for (Future<String> fs : results) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (ExecutionException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } finally {
               exec.shutdown();
            }
        }
    }
}