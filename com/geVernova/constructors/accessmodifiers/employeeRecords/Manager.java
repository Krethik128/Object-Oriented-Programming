package geVernova.constructors.accessmodifiers.employeeRecords;

class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);   //  public
        System.out.println("Department: " + department);    //  protected
        System.out.println("Salary: " + getSalary());       //  use getter
    }
}
