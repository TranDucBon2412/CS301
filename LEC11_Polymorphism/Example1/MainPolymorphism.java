package LEC11_Polymorphism.Example1;

public class MainPolymorphism {

    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Husky();

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }

}