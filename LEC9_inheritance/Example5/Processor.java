
package LEC9_inheritance.Example5;

public class Processor {
    public static void main(String args[]){
        Animal c = new Cat();
        c.makeSound();
        Animal d = new Dog();
        d.makeSound();
        Animal a = new Animal();
        a.makeSound();
    }
}
