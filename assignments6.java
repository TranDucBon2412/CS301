package LEC6_arraylist;

import java.util.ArrayList;
import java.util.Random;

public class assignments6 {
    
    public static void main(String args[]) {
        ArrayList<Integer> mang = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 15; i++) {
            int x = rd.nextInt(50) + 1;
            mang.add(x);
        }
        int chan = 0;
        int le = 0;
        for (int i = 0; i < mang.size(); i++) {
            if (mang.get(i) % 2 == 0) {
                chan++;
            } else {
                le++;
            }
        }
        System.out.print("co " + chan + " so chan || " + le + " so le");
    }
}
