package Bai_3;

public class RunMain {
    public static void main(String[] args) {
        Phieu p = new Phieu();
        p.Nhap();
        p.Xuat();
        System.out.println("Tổng tiền của phiếu: " + p.tongTien());
    }
}
