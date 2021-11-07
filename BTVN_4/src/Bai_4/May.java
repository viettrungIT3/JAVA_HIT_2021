package Bai_4;

import java.util.Scanner;

public class May {
    private String maMay;
    private String kieMay;
    private String tinhTrang;

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã máy: ");         maMay = scanner.nextLine();
        System.out.print("Nhập kiểu máy: ");       kieMay = scanner.nextLine();
        System.out.print("Nhập tình trạng: ");     tinhTrang = scanner.nextLine();
    }

    public void Xuat() {
        System.out.printf("%10s %10s %10s", maMay, kieMay, tinhTrang);
        System.out.println();
    }
}
