package geVernova.objectorientedprogramming.polymorphism.employeemangement;

// Part-time employee calculates salary based on work hours
class PartTimeEmployee extends Employee implements Department {
    private int workHoursPerDay;
    private String deptname;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int yearsOfExp, int workHoursPerDay) {
        super(employeeId, name, baseSalary, yearsOfExp);
        this.workHoursPerDay = workHoursPerDay;
    }

    @Override
    void calculateSalary(int yearsOfExp, double baseSalary) {
        int workingDays = 30; // assuming full month
        double hourlyRate = baseSalary / (30 * 8); // base salary is for 8 hours/day
        double partTimeSalary = hourlyRate * workHoursPerDay * workingDays;
        System.out.println("Salary of the part-time employee is: $" + partTimeSalary);
    }

    @Override
    public void assignDepartment(String deptName) {
        this.deptname = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + deptname;
    }
}
