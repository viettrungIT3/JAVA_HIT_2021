package Bai_1;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String temSP;
    private String tenHangSX;
    private String ngayNhap;

    public String getTenHangSX() {
        return tenHangSX;
    }

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");    maSP = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");    temSP = scanner.nextLine();
        System.out.print("Nhập tên hãng SX: ");    tenHangSX = scanner.nextLine();
        System.out.print("Nhập ngày nhập: ");    ngayNhap = scanner.nextLine();
    }

    public void Xuat() {
        System.out.printf("%10s %15s %15s %10s ", maSP, temSP, tenHangSX, ngayNhap);
    }
}
