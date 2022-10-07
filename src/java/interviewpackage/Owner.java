package interviewpackage;

import java.util.ArrayList;

public class Owner  extends Person{
     ArrayList<Vehicle> vehicles;

    public Owner(ArrayList<Vehicle> vehicles, String name, String address, int age) {
        super(name, address, age);
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "Owner{" + super.toString() + "\nvehicles=" + vehicles + '}';
    }

    public static void main(String[] args) {
        Vehicle ducattibike=new Vehicle("Ducatti Bike","Petrol","Imported","Used");
        //System.out.println(ducattibike);
        Vehicle hondacar=new Vehicle("Honda Car","Desiel","India","New");
        //System.out.println(hondacar);
        ArrayList<Vehicle> vehicles=new ArrayList<>();
        vehicles.add(hondacar);
        vehicles.add(ducattibike);
        Owner owner=new Owner(vehicles, "Sourabh", "Mumbai", 27);
        System.out.println(owner);
    }    
}
