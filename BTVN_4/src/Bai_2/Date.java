package Bai_2;

import java.util.Scanner;

public class Date {
    private int D, M, Y;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày: ");   this.D = scanner.nextInt();
        System.out.print("Nhập tháng: ");   this.M = scanner.nextInt();
        System.out.print("Nhập năm: ");   this.Y = scanner.nextInt();
    }

    public  void Xuat() {
        System.out.println(D + "/" + M + "/" + Y);
    }
}
