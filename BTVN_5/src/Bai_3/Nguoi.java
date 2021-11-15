package Bai_3;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String queQuan;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        this.ngaySinh = scanner.nextLine();
        System.out.print("Quê quán: ");
        this.queQuan = scanner.nextLine();
    }

    public void Xuat() {
        System.out.printf("%20s %12s %12s ", this.hoTen, this.ngaySinh, this.queQuan);
//        String str = "";
//        str += String.format("%20s %12s %12s ", this.hoTen, this.ngaySinh, this.queQuan);
//        return str;
    }

}
