package LEC6_arraylist;

import java.util.ArrayList;

public class assignments2 {

    public static void main(String args[]) {
        ArrayList<String> mang = new ArrayList<>();
        mang.add("red");
        mang.add("blue");
        mang.add("white");
        mang.add("puple");
        mang.add("pink");
        mang.set(1, "yellow");
        for (int i = 0; i < mang.size(); i++) {
            System.out.println("mang [" + i + "]" + mang.get(i));
        }

    }
}
