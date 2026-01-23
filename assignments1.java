package LEC6_arraylist;

import java.util.ArrayList;

public class assignments1 {

    public static void main(String args[]) {
        ArrayList<Integer> mang = new ArrayList<>();
        mang.add(1);
        mang.add(2);
        mang.add(3);
        mang.add(4);
        mang.add(5);
        mang.add(6);
        mang.add(7);
        mang.add(8);
        mang.add(9);
        mang.add(10);
        for (int i = 0; i < mang.size(); i++) {
            System.out.println("mang [" + i + "]" + mang.get(i));
        }

    }
}
