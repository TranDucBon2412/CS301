
package LEC9_inheritance.Example3;
public class Processor {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.makeSound();

        Animal d = new Dog();
        d.makeSound();

        Animal h = new Husky();
        h.makeSound();
    }
}
