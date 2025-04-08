package geVernova.objectorientedprogramming.polymorphism.employeemangement;

// Full-time employee implements calculateSalary() and Department
class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, int yearsOfExp) {
        super(employeeId, name, baseSalary, yearsOfExp);
    }

    @Override
    void calculateSalary(int yearsOfExp, double baseSalary) {
        int bonus = 10; // 10% bonus
        double salaryIncrement = baseSalary + (baseSalary * bonus / 100.00);
        System.out.println("Salary of the full-time employee is $" + salaryIncrement + " with " + bonus + "% bonus.");
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}
