package LEC11_Polymorphism.Example1;

public class MainForEach {

    public static void main(String[] args) {

        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Husky()
        };

        for (Animal a : animals) {
            a.makeSound();
        }
    }

}
