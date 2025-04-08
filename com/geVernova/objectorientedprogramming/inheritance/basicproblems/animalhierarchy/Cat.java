package geVernova.objectorientedprogramming.inheritance.basicproblems.animalhierarchy;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound(){
        System.out.println(name+" does meo meo");
    }

}
