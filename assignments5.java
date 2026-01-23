package LEC6_arraylist;

import java.util.ArrayList;
import java.util.Random;

public class assignments5 {

    public static void main(String args[]) {
        ArrayList<Integer> mang = new ArrayList<>();
        Random rd = new Random();

        for (int i = 0; i < 10; i++) {
            int x = rd.nextInt(100) + 1;
            mang.add(x);
        }
        mang.remove(3);
        System.out.print("mang[]: " + mang);
    }
}
