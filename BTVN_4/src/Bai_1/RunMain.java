package Bai_1;

import java.util.Scanner;

public class RunMain {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số cuốn sách: ");
        int n = scanner.nextInt();

        Sach[] arrs = new Sach[n];

        System.out.println("Nhập n cuốn sách: ");
        for (int i = 0; i < n; i++) {
            arrs[i] = new Sach();
            System.out.println("  Nhập cuốn thứ " + (i+1) + ":");
            arrs[i].Nhap();
        }

        System.out.println("\nDanh sach " + n + " cuốn sách vừa nhập: ");
        System.out.printf("%10s %30s %30s %15s %15s ", "Ma Sach", "Ten Sach", "NXB", "So Trang", "Gia Tien" );
        System.out.println();
        for (int i = 0; i < n; i++) {
            arrs[i].Xuat();
        }
    }
}
