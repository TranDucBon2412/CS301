package LEC11_Polymorphism.Example1;

public class MainInterface {

    public static void main(String[] args) {

        Pet p = new Dog();
        p.play();

        Animal a = new Dog();
        a.makeSound();
    }

}
