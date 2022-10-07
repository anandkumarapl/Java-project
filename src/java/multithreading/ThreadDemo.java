package multithreading;
public class ThreadDemo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo th1 = new ThreadDemo();
      ThreadDemo th2 = new ThreadDemo();
        Thread t1 = new Thread(th1);
       Thread t2 = new Thread(th2);
//        t1.run();
//        t2.run();
        t1.start();
        t2.start();
}
}
