package LEC6_arraylist;

import java.util.ArrayList;
import java.util.Scanner;
public class assignments3 {

    public static void main(String args[]) {
        ArrayList<Double> mang = new ArrayList<>();
        Scanner nhap= new Scanner(System.in);
        System.out.print("so phan tu: ");
        int n = nhap.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("nhap gia tri vao index thu "+i+" : ");
            double x = nhap.nextDouble();
            mang.add(x);
        }
        for (int i = 0; i < mang.size(); i++) {
            System.out.println("mang [" + i + "]" + mang.get(i));
        }

    }
}
