package Bai_1;

import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String NXB;
    private int soTrang;
    private float giaTien;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
        System.out.print("Nhập mã sách: ");
        this.maSach = scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        this.tenSach = scanner.nextLine();
        System.out.print("Nhập NXB: ");
        this.NXB = scanner.nextLine();
        System.out.print("Nhập số trang: ");
        this.soTrang = scanner.nextInt();
        System.out.print("Nhập giá tiền: ");
        this.giaTien = scanner.nextFloat();
    }

    public void Xuat() {
        System.out.printf("%10s %30s %30s %15s %15s ", maSach, tenSach, NXB, soTrang, giaTien );
        System.out.println();
    }
}
