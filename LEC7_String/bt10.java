package LEC7_String;

import java.util.Scanner;

public class bt10 {

    public static void main(String args[]) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s1 = nhap.nextLine();
        String daoNguocMang="";
        for(int i=s1.length()-1;i>=0; i--){
            daoNguocMang = daoNguocMang+s1.charAt(i);
        }
        System.out.println("chuoi sau khi dao nguoc la: " + daoNguocMang);
    }
}
