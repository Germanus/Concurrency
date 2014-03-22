package my.ilya.basic;

/**
 * @author Kazakevich Ilya
 */
public class ThreadMessageMain {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            new Thread(new ThreadMessage()).start();
        System.out.println("Waiting for ThreadMessage!");
    }

}
