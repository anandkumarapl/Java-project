package multithreading;

public class JoinCycleDemo extends Thread {

    int delay;

    public JoinCycleDemo(int delay) {
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(delay);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinCycleDemo demo1 = new JoinCycleDemo(500);
        JoinCycleDemo demo2 = new JoinCycleDemo(800);
        demo1.start();
        demo2.start();
        demo1.join();
        demo2.join();
        System.out.println("Done");
}
}