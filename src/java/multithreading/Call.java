package multithreading;

public class Call extends Thread {

    String thread;
            String t1,t2;

    public Call() {
        //this.thread = thread;
        this.t1=thread;
        this.t2=thread;
    }

    public static  void Phone(String t1,String t2) {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println(t1+" : "+t2);
                Thread.sleep(500);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    @Override
    public void run() {
        Phone(t1,t2);
    }
    public static void main(String[] args) {
            Call demo = new Call();
            demo.start();
}
}
