package Bai_1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n = ");
        int n = scanner.nextInt();

        ArrayList<DieuHoa> dieuHoaList = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.println("--- Nhập điều hoà thứ " + (i + 1) + ":");
            DieuHoa temp = new DieuHoa();
            temp.Nhap();
            dieuHoaList.add(temp);
        }
        System.out.println("-------------------------------------------------------------------------------");

//        Hiển thị toàn bộ danh sách
        System.out.println("\nDanh sách " + n + " điều hoà: ");
        System.out.printf("%10s %15s %15s %10s %10s %10s", "Mã SP", "Tên SP", "Hãng SX", "Ngày nhập", "Công suất(W)", "Giá bán");
        System.out.println();
        for (DieuHoa x : dieuHoaList) {
            x.Xuat();
        }
        System.out.println("-------------------------------------------------------------------------------");

//        Hiển thị danh sách các điều hòa có hãng sản xuất Electrolux.
        int count = 0;
        for (DieuHoa x : dieuHoaList) {
            if (x.getTenHangSX().equals("Electrolux")) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("\nKhông có điều hoà nào có hãng sản xuất là Electrolux.");
        } else {
            System.out.println("\nDanh sách các điều hòa có hãng sản xuất Electrolux: ");
            System.out.printf("%10s %15s %15s %10s %10s %10s", "Mã SP", "Tên SP", "Hãng SX", "Ngày nhập", "Công suất(W)", "Giá bán");
            System.out.println();
            for (DieuHoa x : dieuHoaList) {
                x.Xuat();
            }
        }
        System.out.println("-------------------------------------------------------------------------------");

//        In ra các sản phẩm có  giá bán thấp nhất.
        int countP = 0;
        float minP = dieuHoaList.get(0).getGiaBan();
        for (DieuHoa x : dieuHoaList) {
            if (x.getGiaBan() < minP) {
                minP = x.getGiaBan();
                countP = 0;
            }
            if (x.getGiaBan() == minP) {
                countP++;
            }
        }
        if (countP == n || n == 1) {
            System.out.println("\nKhông tồn tại điều hoà có giá bán thấp nhất.");
        } else {
            System.out.println("\nDanh sách các điều hòa có giá bán thấp nhất: ");
            System.out.printf("%10s %15s %15s %10s %10s %10s", "Mã SP", "Tên SP", "Hãng SX", "Ngày nhập", "Công suất(W)", "Giá bán");
            System.out.println();
            for (DieuHoa x : dieuHoaList) {
                x.Xuat();
            }
        }
        System.out.println("-------------------------------------------------------------------------------");
    }
}
