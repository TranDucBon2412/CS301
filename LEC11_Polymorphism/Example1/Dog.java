package LEC11_Polymorphism.Example1;

public class Dog extends Animal implements Pet {

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("Dog plays");
    }

}