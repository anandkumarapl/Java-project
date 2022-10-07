package interviewpackage;


import java.util.Scanner;

public class Vehicle {
   String vehicletype,fueltype,importedormadeinindia,countryorigen;

    public Vehicle(String vehicletype, String fueltype, String importedormadeinindia, String countryorigen) {
        this.vehicletype = vehicletype;
        this.fueltype = fueltype;
        this.importedormadeinindia = importedormadeinindia;
        this.countryorigen = countryorigen;
    }
   
   
//   
//   public Vehicle(){
//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter Vehicle Details");
//       System.out.println("vehicletype");
//       vehicletype=sc.nextLine();
//       System.out.println("fueltype");
//       fueltype=sc.nextLine();
//       System.out.println("importedormadeinindia");
//       importedormadeinindia=sc.nextLine();
//       System.out.println("countryorigen");
//       countryorigen=sc.nextLine();
//   }

    @Override
    public String toString() {
        return "\nVehicle{" + "vehicletype=" + vehicletype + ", fueltype=" + fueltype + ", importedormadeinindia=" + importedormadeinindia + ", countryorigen=" + countryorigen + '}';
    }

    
   public static void main(String args[]){
   //    Vehicle a=new Vehicle();
        //   System.out.print(a);
       
   }
}
