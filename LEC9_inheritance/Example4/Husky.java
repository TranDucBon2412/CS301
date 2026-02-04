package LEC9_inheritance.Example4;

public class Husky extends Dog {

    Husky(String origin) {
        super(origin);
    }

    @Override
    void makeSound() {
        System.out.println("Husky howls");
    }
}
