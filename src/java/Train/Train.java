package Train;

public class Train {
    String trainname;

    public Train(String trainname ) {
        this.trainname = trainname;
           }

    @Override
    public String toString() {
        return "Train{" + "trainname=" + trainname + '}';
    }
    public void call(Train t) {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.printf("%s running to %s %d \n", "trainnumber", i);
                Thread.sleep(1000);
            }
        } catch (Exception ex) {
            System.out.println(ex);

        }

    }
}
