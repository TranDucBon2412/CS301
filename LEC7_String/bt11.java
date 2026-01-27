package LEC7_String;

import java.util.Scanner;

public class bt11 {

    public static void main(String args[]) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = nhap.nextLine();
        s=s.trim();
        s=s.replaceAll("\\s+", " ");
        System.out.println("chuoi sau khi xoa space: "+s);
        
    }
}
