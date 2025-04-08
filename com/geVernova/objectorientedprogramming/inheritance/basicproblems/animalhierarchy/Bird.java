package geVernova.objectorientedprogramming.inheritance.basicproblems.animalhierarchy;

public class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound(){
        System.out.println(name+" makes chirp chirp");
    }
}
