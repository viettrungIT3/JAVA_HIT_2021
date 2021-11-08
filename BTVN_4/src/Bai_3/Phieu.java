package Bai_3;

import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private Hang[] x;
    private int n;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã phiếu: ");
        this.maPhieu = scanner.nextLine();
        System.out.print("Nhập số lượng mặt hàng n = ");
        n = scanner.nextInt();
        x = new Hang[n];
        for (int i = 0; i < n; i++) {
            x[i] = new Hang();
            System.out.println("  Nhập mặt hàng thứ " + (i + 1) + ": ");
            x[i].Nhap();
        }
    }

    public void Xuat() {
        System.out.println("--------------------------THÔNG TIN PHIẾU--------------------------");
        System.out.println("Mã phiếu: " + maPhieu);
        System.out.println("Danh sách " + n + " mặt hàng: ");
        System.out.printf("%10s %20s %12s", "Mã hàng", "Tên hàng", "Đơn giá");
        System.out.println();
        for (int i = 0; i < n; i++) {
            x[i].Xuat();
        }
    }

    public float tongTien() {
        float tong = 0;
        for (int i = 0; i < n; i++) {
            tong += x[i].getDonGia();
        }
        return tong;
    }
}
