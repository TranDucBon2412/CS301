package LEc8_ObjectsAndClass.numberParametsers;

public class OverloadingExample3 {

    public static void printlnfo(String a, int b) {
        System.out.println("name: " + a + "; age: " + b);
    }

    public static void printlnfo(int a, String b) {
        System.out.println("age: " + a + "; name: " + b);
    }
}
