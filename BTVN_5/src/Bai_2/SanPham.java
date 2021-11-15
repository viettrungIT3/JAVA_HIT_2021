package Bai_2;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private int SL;
    private float DG;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        this.maSP = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        this.tenSP = scanner.nextLine();
        System.out.print("Nhập số lượng: ");
        this.SL = scanner.nextInt();
        System.out.print("Nhập đơn giá: ");
        this.DG = scanner.nextFloat();
    }

    public float getTT() {
        return DG * SL;
    }

    public void  Xuat() {
        System.out.printf("%10s %20s %10s %10s %12s ", maSP, tenSP, SL, DG, getTT() );
        System.out.println();
    }
}
