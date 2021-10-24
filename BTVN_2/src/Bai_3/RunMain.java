package Bai_3;

import java.util.Scanner;

public class RunMain {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.print("Nhập chuỗi: ");
//        String str = scanner.nextLine();
        String str = " Trung 15082001";
        System.out.println(CheckNumber(str));
        System.out.println(AvgNumber(str));
    }

    // Kiểm tra chuỗi chứa ký tự số hay không
    public static boolean CheckNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                return true;
        }
        return false;
    }

    public static float AvgNumber(String str) {
        int sum = 0, count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
                count++;
            }
        }
        float avg = (float) sum / count;
        return avg;
    }

}
