
package multithreading;

import java.util.Scanner;
public class LifeCycleDemo extends Thread {

    @Override
    public void run() {
        for (int i = 0;; i++) {
            try {
                System.out.println(i);
                Thread.sleep(500);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    public static void main(String[] args) {
        LifeCycleDemo demo = new LifeCycleDemo();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("0-Start,1-Resume,2-Suspend,3-Stop");
            int option = s.nextInt();
            switch (option) {
                case 0:
                    demo.start();
                    break;
                case 1:
                    demo.resume();
                    break;
                case 2:
                    demo.suspend();
                    break;
                case 3:
                    demo.stop();
                    break;
                case 4:
                    return;
            }
}}
}