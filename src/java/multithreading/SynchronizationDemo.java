package multithreading;

public class SynchronizationDemo extends Thread {

    int thread;

    public SynchronizationDemo(int thread) {
        this.thread = thread;
    }

    public static synchronized void demo(int thread) {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println(thread + " : " + i);
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    @Override
    public void run() {
        demo(thread);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            SynchronizationDemo demo = new SynchronizationDemo(i);
            demo.start();
}
}
}