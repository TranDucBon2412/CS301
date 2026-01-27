package LEC7_String;

import java.util.Scanner;

public class bt9 {

    public static void main(String args[]) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap mang: ");
        String s1 = nhap.nextLine();
        String[] mang = s1.split(" ");
        int dem = mang.length;
        System.out.println("chuoi co "+dem+" tu");
    }
}
