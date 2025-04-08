package geVernova.objectorientedprogramming.inheritance.hierarchicalInheritance.schoolSystem;

class Staff extends Person {
    private String position;

    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Position: " + position);
    }
}
