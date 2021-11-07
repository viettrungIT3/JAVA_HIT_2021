package Bai_4;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTen;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã quản lý: ");
        maQL = scanner.nextLine();
        System.out.print("Nhập họ và tên: ");
        hoTen = scanner.nextLine();
    }

    public void Xuat() {
        System.out.println("Mã quản lý: " + maQL);
        System.out.println("Họ tên QL: " + hoTen);
    }
}
