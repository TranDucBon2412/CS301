package LEC7_String;

import java.util.Scanner;

public class bt12 {

    public static void main(String args[]) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = nhap.nextLine();
        System.out.print("nhap ki tu can dem: ");
        String n = nhap.nextLine();
        int dem =0;
        char x = n.charAt(0);
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)==x){
                dem++;
            }
        }
        System.out.print("so lan xuat hien cua "+n+" trong mang la "+dem+" lan");
        
    }
}
