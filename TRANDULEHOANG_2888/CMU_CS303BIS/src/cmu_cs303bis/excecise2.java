package cmu_cs303bis;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class excecise2 {

    public static void main(String args[]) throws Exception {
        Scanner lhoang = new Scanner(System.in);
        System.out.print("Nhap Ten: ");
        String ten = lhoang.nextLine();
        System.out.print("Nhap MSSV: ");
        Long mssv = lhoang.nextLong();
        System.out.print("Nhap Que Quan: ");
        String que = lhoang.nextLine();
        lhoang.nextLine();
        System.out.print("Nhap GPA: ");
        Float diem = lhoang.nextFloat();
        lhoang.nextLine();
        System.out.print("Nhap nghe nghiep: ");
        String nghe = lhoang.nextLine();
        System.out.print("Nhap hoc bong(True/False): ");
        boolean hb = lhoang.nextBoolean();
        lhoang.nextLine();
        System.out.print("Nhap ngay thang nam sinh(dd/mm/yyyy): ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        Date birth = sdf.parse(lhoang.nextLine());
        System.out.println("Ho va ten la: " + ten);
        System.out.println("Ma so sinh vien la: " + mssv);
        System.out.println("Que quan la: " + que);
        System.out.println("Diem GPA: " + diem);
        System.out.println("Nghe nghiep la: " + nghe);
        System.out.println("Tinh trang hoc bong: " + (hb ? "Co hoc bong" : "Khong co hoc bong"));
        System.out.println("Ngay thang nam sinh: " + sdf.format(birth));

    }
}
