package Bai_3;

import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private float donGia;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã hàng: ");
        this.maHang = scanner.nextLine();
        System.out.print("Nhập tên hàng: ");
        this.tenHang = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        this.donGia = scanner.nextInt();
    }

    public void Xuat() {
        System.out.printf("%10s %20s %12s", maHang, tenHang, donGia);
        System.out.println();
    }
}
