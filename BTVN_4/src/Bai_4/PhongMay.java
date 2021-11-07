package Bai_4;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private float dienTich;
    private QuanLy x;
    private May[] y;
    int n;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã phòng: ");   maPhong = scanner.nextLine();
        System.out.print("Nhập tên phòng: ");   tenPhong = scanner.nextLine();
        System.out.print("Nhập diện tích: ");   dienTich = scanner.nextFloat();
        x = new QuanLy();
        x.Nhap();
        System.out.print("Nhập số lượng máy n = ");    n = scanner.nextInt();
        y = new May[n];
        System.out.println("Nhập thông tin máy: ");
        for (int i = 0; i < n; i++) {
            y[i] = new May();
            System.out.println("  Nhập thông tin máy " + (i+1) + ":");
            y[i].Nhap();
        }
    }

    public void Xuat() {
        System.out.println("\n--------------THÔNG TIN PHÒNG MÁY--------------");
        System.out.println("Mã phòng: " + maPhong);
        System.out.println("Tên phòng: " + tenPhong);
        System.out.println("Diện tích: " + dienTich + "m2");
        x.Xuat();
        System.out.println("Danh sach " + n + " máy:");
        System.out.printf("%10s %10s %10s", "Mã máy", "Kiểu máy", "Tình trạng");
        System.out.println();
        for (int i = 0; i < n; i++) {
            y[i].Xuat();
        }
    }
}
