package LEC6_arraylist;

import java.util.ArrayList;
import java.util.Scanner;
public class assignments7 {

    public static void main(String args[]) {
        ArrayList<Double> mang = new ArrayList<>();
        Scanner nhap= new Scanner(System.in);
        System.out.println("nhap 5 gia tri ngau nhien ");
        for(int i=0; i<5; i++){
            System.out.print("nhap gia tri vao index thu "+i+" : ");
            double x = nhap.nextDouble();
            mang.add(x);
        }
        for(int i=0; i<mang.size()/2; i++){
            double temp = mang.get(i);
            mang.set(i, mang.get(mang.size()-1-i));
            mang.set(mang.size()-1-i, temp);
        }
        System.out.print("mang sau khi dao nguoc: ");
        for(int i=0; i<mang.size();i++){
            System.out.print(mang.get(i)+" ");
        }
             

    }
}
