import java.util.ArrayList;

public class Garage {
    ArrayList<Vehicle> garage = new ArrayList<>();

    public void addVehicle(Vehicle vehicle){
        if(garage.size()<5){
            garage.add(vehicle);
            System.out.println("\nParked vehicle\n");
        }else{
            System.out.println("\nFull garage\n");
        }
    }

    public void showVehicles(){
        for(int i=0;i< garage.size();i++){
            System.out.println(garage.get(i).showInfo());
        }
    }

    public void moveAll(){
        for(int i=0;i< garage.size();i++){
            garage.get(i).move();
        }
    }
}
