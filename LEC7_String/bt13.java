package LEC7_String;

import java.util.Scanner;

public class bt13 {

    public static void main(String args[]) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = nhap.nextLine();
        System.out.print("Nhap tu can thay: ");
        String cut = nhap.nextLine();
        System.out.print("Nhap tu thay the: ");
        String replace = nhap.nextLine();
        String end = s.replace(cut, replace);
        System.out.print("chuoi sau khi thay the: "+end);
        
    }
}
