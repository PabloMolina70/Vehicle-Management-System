import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Garage garage = new Garage();
        int option;

        do {
            System.out.println("\n--- Vehicle Management System ---");
            System.out.println("1. Add a Car");
            System.out.println("2. Add a Motorcycle");
            System.out.println("3. Show all vehicles in the garage.");
            System.out.println("4. Move all vehicles.");
            System.out.println("5. Exit.");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1,2:

                    String brand;
                    String model;
                    int year;

                    System.out.println("What is the brand?");
                    brand=sc.nextLine();
                    System.out.println("What is the model?");
                    model=sc.nextLine();
                    System.out.println("What is the year of manufacturing?");
                    year=sc.nextInt();
                    switch (option){
                        case 1:
                            int numDoors;
                            System.out.println("What is the number of doors?");
                            numDoors=sc.nextInt();
                            garage.addVehicle(new Car(brand,model,year,numDoors));
                            break;
                        case 2:
                            int engineCapacity;
                            System.out.println("What is the engine capacity?");
                            engineCapacity=sc.nextInt();
                            garage.addVehicle(new Motorcycle(brand,model,year,engineCapacity));
                            break;
                    }
                    break;
                case 3:
                    garage.showVehicles();
                    break;
                case 4:
                    garage.moveAll();
                    break;
                case 5:
                    System.out.println("GoodBye");
                    break;
                default:
                    System.out.println("Use a valid number");
                    break;
            }
        }while (option!=5);
    }
}