package geVernova.objectorientedprogramming.polymorphism.employeemangement;

// Abstract class with shared structure for all employee types
abstract class Employee {
    private final int employeeId;
    private final String name;
    protected double baseSalary;
    private final int yearsOfExp;

    public Employee(int employeeId, String name, double baseSalary, int yearsOfExp) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearsOfExp = yearsOfExp;
    }

    // Abstract method to be implemented differently by full-time and part-time employees
    abstract void calculateSalary(int yearsOfExp, double baseSalary);

    // Concrete method shared by all subclasses
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Years of Experience: " + yearsOfExp);
    }

    // Getters for encapsulated fields
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }
}
