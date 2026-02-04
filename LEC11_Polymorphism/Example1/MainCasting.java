package LEC11_Polymorphism.Example1;

public class MainCasting {

    public static void main(String[] args) {

        Animal a = new Husky();

        if (a instanceof Husky) {
            Husky h = (Husky) a;
            h.makeSound();
        }
    }

}
