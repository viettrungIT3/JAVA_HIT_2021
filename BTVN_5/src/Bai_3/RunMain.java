package Bai_3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc();

//        Nhập
        System.out.print("Nhập mã lớp học: ");
        lopHoc.setMaLH(scanner.nextLine());
        System.out.print("Nhập tên lớp học: ");
        lopHoc.setTenLH(scanner.nextLine());
        System.out.print("Nhập ngày mở: ");
        lopHoc.setNgayMo(scanner.nextLine());
        System.out.print("Nhập số lượng sinh viên n = ");
        lopHoc.setN(scanner.nextInt());
        scanner.nextLine();

        ArrayList<SinhVien> dsSinhVien = new ArrayList<>(lopHoc.getN());

        for (int i = 0; i < lopHoc.getN(); i++) {
            SinhVien sv = new SinhVien();
            System.out.println("--- Nhập sinh viên thứ " + (i + 1) + ":");
            System.out.print("Nhập mã sinh viên: ");
            sv.setMaSV(scanner.nextLine());
            sv.Nhap();
            System.out.print("Nhập ngành học: ");
            sv.setNganh(scanner.nextLine());
            System.out.print("Nhập khoá học: ");
            sv.setKhoaHoc(scanner.nextInt());
            scanner.nextLine();

            dsSinhVien.add(sv);
        }

        lopHoc.setX(dsSinhVien);

        System.out.print("Nhập giáo viên: ");
        lopHoc.setGiaoVien(scanner.nextLine());

//        Xuất
        System.out.println("\n\n----------------THÔNG TIN LỚP HỌC----------------");
        System.out.printf("%12s %10s", "Mã lớp: ", lopHoc.getMaLH());
        System.out.printf("%15s %10s", "Tên lớp: ", lopHoc.getTenLH());
        System.out.println();
        System.out.printf("%12s %10s", "Giáo viên: ", lopHoc.getGiaoVien());
        System.out.printf("%15s %10s", "Ngày mở: ", lopHoc.getNgayMo());
        System.out.println();
        System.out.println("Danh sách sinh viên trong lớp: ");
        System.out.printf("%10s %20s %12s %12s %12s %12s", "Mã SV", "Họ tên", "Ngày sinh", "Quên quán", "Ngành học", "Khoá học.");
        System.out.println();
        for (int i = 0; i < lopHoc.getN(); i++) {
            XuatSV(lopHoc.getX().get(i));
        }
        System.out.println("-----------------------------------------------------------------------------------");

//        Cho biết lớp học có bao nhiêu sinh viên khóa 15.
        int countK15 = 0;
        for (SinhVien x : lopHoc.getX()) {
            if (x.getKhoaHoc() == 15) {
                countK15++;
            }
        }
        if (countK15 == 0) {
            System.out.println("\n * Không có sinh viên khoá 15 nào.");
        } else {
            System.out.println("\n * Có " + countK15 + " sinh viên khoá 15: ");
            System.out.printf("%10s %20s %12s %12s %12s %12s", "Mã SV", "Họ tên", "Ngày sinh", "Quên quán", "Ngành học", "Khoá học.");
            System.out.println();
            for (SinhVien x : lopHoc.getX()) {
                if (x.getKhoaHoc() == 15) {
                    XuatSV(x);
                }
            }
        }
        System.out.println("-----------------------------------------------------------------------------------");

//        Sắp xếp danh sách các sinh viên của lớp học theo chiều tăng dần của khóa học và in lại thông tin của lớp học ra màn hình.
        SapXep(lopHoc.getX());
//        Collections.sort(lopHoc.getX());     // đang bị bug, chưa sử lý xong
        System.out.println("\n * Danh sách sinh viên sau khi sắp xếp là: ");
        System.out.printf("%10s %20s %12s %12s %12s %12s", "Mã SV", "Họ tên", "Ngày sinh", "Quên quán", "Ngành học", "Khoá học.");
        System.out.println();
        for (SinhVien x : lopHoc.getX()) {
            XuatSV(x);
        }
        System.out.println("-----------------------------------------------------------------------------------");
    }

    //    Hàm xuất sinh viên
    public static void XuatSV(SinhVien sv) {
        System.out.printf("%10s ", sv.getMaSV());
        sv.Xuat();
//        System.out.printf("%44s ", sv.Xuat());
        System.out.printf("%12s %12s", sv.getNganh(), sv.getKhoaHoc());
        System.out.println();
    }

    //    Hàm sắp xếp
    public static void SapXep(ArrayList<SinhVien> dsSV) {
        for (int i = 0; i < dsSV.size() - 1; i++) {
            for (int j = i + 1; j < dsSV.size(); j++) {
                if (dsSV.get(i).getKhoaHoc() > dsSV.get(j).getKhoaHoc()) {
                    SinhVien temp = dsSV.get(i);
                    dsSV.set(i, dsSV.get(j));
                    dsSV.set(j, temp);
                }
            }
        }
    }
}
