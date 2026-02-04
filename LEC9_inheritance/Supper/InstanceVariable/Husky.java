package LEC9_inheritance.Supper.InstanceVariable;

public class Husky extends Dog {

    int price = 1500;

    void displayPrice() {
        System.out.println("Dog's Price: " + super.price);
        System.out.println("Husky's price: " + price);
    }
}
