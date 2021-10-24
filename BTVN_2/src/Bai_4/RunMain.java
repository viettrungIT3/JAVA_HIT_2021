package Bai_4;

import java.util.Scanner;

public class RunMain {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.printf("Nhập chuỗi: ");
//        String str = scanner.nextLine();
        String str = "   Nguyen    Viet    Trung   1508     ";

        str = FormStr(str);
        System.out.println(str);
    }

    public static String FormStr(String str) {
        String strNew = str;

        strNew = strNew.trim();       // Xoá bỏ khoảng trắng đầu và cuối
        strNew = strNew.toLowerCase();    // Chuyển về dạng chữ in thường
        strNew = strNew.replaceAll("[0-9]{1,}", " ");     // Thay thế tất cả số thành kí tự ''

        String[] arrWord = strNew.split(" ");   //Tách chuỗi thành từng từ nhỏ lưu vào mảng
        strNew = "";
        for (String Word : arrWord) {
            // Nếu chuỗi đó lớn hơn 0 thì xử lý từ đó
            if (Word.length() > 0) {
                Word = Word.replaceFirst(Word.charAt(0) + "", (Word.charAt(0) + "").toUpperCase());   // Thay thế ký tự đầu tiên từ chữ thường sang chữ hoa
                strNew += Word + " ";       // Nối các tự lại
            }
        }
        strNew = strNew.trim();
        return strNew;
    }
}
