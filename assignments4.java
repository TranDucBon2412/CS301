package LEC6_arraylist;

import java.util.ArrayList;
import java.util.Scanner;
public class assignments4 {

    public static void main(String args[]) {
        ArrayList<String> mang = new ArrayList<>();
        Scanner nhap= new Scanner(System.in);
        mang.add("London");
        mang.add("Paris");
        mang.add("Tokyo");
        mang.add("NewYork");
        mang.add("Danang");
        System.out.print("Nhap ten thanh pho: ");
        String in = nhap.nextLine();
        if(mang.contains(in)){
            System.out.println("ban da nhap dung!");
        } else{
            System.out.println("Nhap lai di ban e");
        }
       
    }
}
