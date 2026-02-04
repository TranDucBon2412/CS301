package LEC10_Abstraction.Interface.Example2;

public class Circle implements IColor {

    @Override
    public void drawShape() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void fillColor() {
        System.out.println("Filling tha circle with green");
    }

}
