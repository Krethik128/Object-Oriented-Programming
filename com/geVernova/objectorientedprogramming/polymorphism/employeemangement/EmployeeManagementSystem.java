package geVernova.objectorientedprogramming.polymorphism.employeemangement;

import java.util.ArrayList;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Creating full-time and part-time employees
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101, "Alice", 50000, 5);
        fullTimeEmployee.assignDepartment("Engineering");

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(102, "Bob", 30000, 2, 4);
        partTimeEmployee.assignDepartment("Support");

        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        // Polymorphism in action: treat all employees via Employee reference
        for (Employee emp : employees) {
            System.out.println("\n--- Employee Details ---");
            emp.displayDetails();
            emp.calculateSalary(emp.getYearsOfExp(), emp.getBaseSalary());

            // instanceof used to safely access interface methods
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
        }
    }
}
