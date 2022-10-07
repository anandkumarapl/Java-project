package Train;
public class Tracks extends Thread{
   int trackname;
public Tracks(int trackname){
      this.trackname=trackname;
}

    @Override
    public String toString() {
        return "Tracks{" + "trackname=" + trackname + '}';
    }
    
    public void passTheTrain(Train train){
        try{
        for(int i=0;i<=10;i++){
        System.out.print(train+"this is crossing"+this);
        System.out.println(i);
        Thread.sleep(1000);
    }
        System.out.print(train+"this is crossing"+this);
    } catch(Exception ex){
           System.out.println(ex);
                }       
}
       public static void main(String args[]){
         Tracks t1=new Tracks(10);
         t1.start();
       
    }
}
   
    