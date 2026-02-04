package LEC9_inheritance.Example4;

public class Processor {

    public static void main(String[] args) {

        Animal a = new Animal("Unknown");
        a.makeSound();

        Animal d = new Dog("USA");
        d.makeSound();

        Animal h = new Husky("Russia");
        h.makeSound();

        System.out.println(h.origin);
    }
}
