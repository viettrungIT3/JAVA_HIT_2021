package Bai_1;

import java.util.Scanner;

public class DieuHoa extends SanPham {
    private int congSuat;
    private float giaBan;

    public float getGiaBan() {
        return giaBan;
    }

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        super.Nhap();
        System.out.print("Nhập  công suất: ");
        this.congSuat = scanner.nextInt();
        System.out.print("Nhập giá bán: ");
        this.giaBan = scanner.nextInt();
    }

    public void Xuat() {
        super.Xuat();
        System.out.printf("%10s %10s ", congSuat, giaBan);
        System.out.println();
    }
}
