package LEC9_inheritance.Example4;

public class Dog extends Animal {

    Dog(String origin) {
        super(origin);
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
