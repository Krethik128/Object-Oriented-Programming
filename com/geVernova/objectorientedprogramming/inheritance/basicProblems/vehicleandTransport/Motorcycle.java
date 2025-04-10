package geVernova.objectorientedprogramming.inheritance.basicProblems.vehicleandTransport;
class Motorcycle extends Vehicle {
    private boolean hasGear;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
    }
}
