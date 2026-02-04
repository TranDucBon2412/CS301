package LEC9_inheritance.Example2;

public class Cat extends Animal {

    String catID = "manh_nung_cuto<3";
    
    void catchMouse() {
        System.out.println("Catch the mouse");
    }
    @Override
    void makeSound(){
        super.makeSound();
        System.out.println("meow meow");
    }
}
