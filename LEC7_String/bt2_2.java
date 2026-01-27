package LEC7_String;

public class bt2_2 {

    public static void main(String args[]) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("Hello");

        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
    }
}
