package LEC9_inheritance.Supper.Method;

public class Husky extends Dog {

    void displayInformation() {
        super.displayPrice();
        System.out.println("Husky's price: 1500");
    }
}
