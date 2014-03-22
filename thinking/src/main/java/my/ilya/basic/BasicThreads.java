package my.ilya.basic;

/**
 * @author Kazakevich Ilya
 */
public class BasicThreads {

    public static void main(String[] args) {
        new Thread(new LiftOff()).start();
        System.out.println("Waiting for LiftOff!");
    }

}
