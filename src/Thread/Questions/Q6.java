package Thread.Questions;

public class Q6 {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        thread.interrupt();
    }
}
