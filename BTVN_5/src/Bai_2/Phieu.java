package Bai_2;

import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private String tenPhieu;
    private DateTime a;
    private SanPham[] x;
    private int n;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã phiếu: ");
        this.maPhieu = scanner.nextLine();
        System.out.print("Nhập tên phiếu: ");
        this.tenPhieu = scanner.nextLine();

        a = new DateTime();
        a.Nhap();

        System.out.print("Nhập số sản phẩm n = ");
        this.n = scanner.nextInt();
        x = new SanPham[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("--- Nhập sản phẩm thứ: " + (i + 1));
            x[i] = new SanPham();
            x[i].Nhap();
        }
    }

    public void Xuat() {
        System.out.println("Mã Phiếu: " + maPhieu);
        System.out.println("Tên Phiếu: " + tenPhieu);
        a.Xuat();
        System.out.printf("%10s %20s %10s %10s %12s ", "Mã SP", "Tên SP", "Số Lượng", "Đơn Gía", "Thành Tiền");
        System.out.println();
        for (int i = 0; i < n; i++) {
            x[i].Xuat();
        }
    }
}
