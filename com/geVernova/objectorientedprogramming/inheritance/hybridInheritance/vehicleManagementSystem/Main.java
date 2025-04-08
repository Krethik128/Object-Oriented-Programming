package geVernova.objectorientedprogramming.inheritance.hybridInheritance.vehicleManagementSystem;

public class Main {
    public static void main(String[] args){
        System.out.println("\n--- Vehicle Management Hybrid Inheritance ---");
        ElectricVehicle teslaModelS = new ElectricVehicle("Tesla Model S", 250);
        PetrolVehicle petrolVehicle = new PetrolVehicle("Honda City", 180);

        teslaModelS.showSpecs();
        teslaModelS.charge();
        System.out.println();
        petrolVehicle.showSpecs();
        petrolVehicle.refuel();
    }
}
