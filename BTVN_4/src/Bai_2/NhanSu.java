package Bai_2;

import java.util.Scanner;

public class NhanSu {
    private String maNS;
    private String hoTen;
    Date NS;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã nhân sự: ");     this.maNS = scanner.nextLine();
        System.out.print("Nhập họ và tên: ");      this.hoTen = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        this.NS = new Date();
        this.NS.Nhap();
    }

    public void Xuat() {
        System.out.println("Thông tin nhân sự vừa nhập là: ");
        System.out.println("Mã nhân sự: " + maNS);
        System.out.println("Họ và tên: " + hoTen);
        System.out.print("Ngày sinh: ");
        NS.Xuat();
    }
}
