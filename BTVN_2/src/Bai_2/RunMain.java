package Bai_2;

import java.util.Scanner;

public class RunMain {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int[] arr = {1, 2, 10, 4, 5};
        int[] arr = {};
        int n = arr.length;

        while (true) {
            System.out.println("----------------------------MENU----------------------------");
            System.out.println("| 1. Nhập mảng với n số nguyên.                             |");
            System.out.println("| 2. Hiển thị mảng vừa tạo                                  |");
            System.out.println("| 3. Thêm 1 phần tử vào vị trí k bất kỳ                     |");
            System.out.println("| 4. Xoá 1 phần tử tại vị trí k bất kỳ                      |");
            System.out.println("| 5. Hiển thị mảng đảo ngược                                |");
            System.out.println("| 6. Hiển thị phần tử a[1] và các số chia hết cho a[1]      |");
            System.out.println("| 7. Xuất ra màn hình tổng các số nguyên tố có trong mảng   |");
            System.out.println("| 8. Thoát chương trình                                     |");
            System.out.println("------------------------------------------------------------");
            System.out.print("Mời bạn chọn: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("  1. Nhập mảng với n số nguyên:");
                    System.out.print("Nhập số lượng phần tử n = ");
                    n = scanner.nextInt();
                    arr = new int[n];
                    InputArr(arr, n);
                    break;
                case 2:
                    System.out.println("  2. Hiển thị mảng vừa tạo:");
//                    System.out.print("Mảng vừa nhập: ");
                    System.out.print("Mảng vừa nhập " + n + " số nguyên: ");
                    ShowArr(arr, n);
                    break;
                case 3:
                    System.out.println("  3. Thêm 1 phần tử vào vị trí k bất kỳ:");
                    System.out.print("Nhập giá trị thêm: ");
                    int val = scanner.nextInt();
                    System.out.print("Nhập vị trí k muốn thêm: ");
                    int k = scanner.nextInt();
                    // Vị trí thực
                    k--;
                    // Hàm thêm
                    arr = Insert_K(arr, val, k);
                    // Gán lại giá trị n
                    n = arr.length;
                    break;
                case 4:
                    System.out.println("  4. Xoá 1 phần tử tại vị trí k bất kỳ:");
                    System.out.print("Nhập vị trí k muốn xoá: ");
                    int k1 = scanner.nextInt();
                    // Vị trí thực
                    k1--;
                    // Hàm thêm
                    arr = Delete_K(arr, k1);
                    // Gán lại giá trị n
                    n = arr.length;
                    break;
                case 5:
                    System.out.println("  5. Hiển thị mảng đảo ngược:");
                    ShowReverseArray(arr);
                    break;
                case 6:
                    System.out.println("  6. Hiển thị phần tử a[1] và các số chia hết cho a[1]");
                    ShowDivisible_A1(arr);
                    break;
                case 7:
                    System.out.println("  7. Xuất ra màn hình tổng các số nguyên tố có trong mảng:");
                    ShowSumPrime(arr);
                    break;
                case 8:
                    System.out.println("  8. Thoát chương trình.");
                    System.exit(0);
            }
            System.out.print("Bạn có muốn tiếp tục không(C/K)? ");
            scanner.nextLine();
            String check = scanner.nextLine();
            System.out.println();
            if (check.equalsIgnoreCase("k")) {
                System.exit(0);
            }
        }
    }

    // Nhập mảng
    public static void InputArr(int[] arr, int n) {
        System.out.print("Nhập lần lượt " + n + " số nguyên vào mảng: ");
        for (int i = 0; i < n; i++) {
            // Nhập lần lượt các phần tử mảng
            arr[i] = scanner.nextInt();
        }
    }

    // Hiển thị mảng
    public static void ShowArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // Xuống dòng
        System.out.println();
    }

    // Thêm một phần tử vào 1 vị trí trong mảng
    public static int[] Insert_K(int[] arr, int val, int pos) {
        // Tạo một mảng mới
        int[] newArr = new int[arr.length + 1];
        int index = 0;
        // Copy từng phần tử
        for (int i = 0; i < arr.length; i++) {
            if (i == pos) {
                newArr[index] = val;
                index++;
            }
            newArr[index] = arr[i];
            index++;
        }

        // return kết quả
        return newArr;
    }

    // Xoá 1 phần tử tại 1 vị trí trong mảng
    public static int[] Delete_K(int[] arr, int pos) {
        // Tạo một mảng mới
        int[] newArr = new int[arr.length - 1];
        int index = 0;

        // Copy từng phần tử
        for (int i = 0; i < arr.length; i++) {
            if (i != pos) {
                newArr[index] = arr[i];
                index++;
            }
        }

        // return kết quả
        return newArr;
    }

    // Hiển thị mảng đảo ngược
    public static void ShowReverseArray(int[] arr) {
        System.out.print("Mảng đảo ngược: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        // Xuống dòng
        System.out.println();
    }

    public static void ShowDivisible_A1(int[] arr) {
        System.out.println("Phần tử a[1] = " + arr[1]);
        System.out.print("Những phần tử chia hết cho a[1], đó là: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % arr[1] == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Xuất ra màn hình tổng các số nguyên tố có trong mảng
    public static void ShowSumPrime(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]))
                sum += arr[i];
        }

        // Xuất ra màn hình
        System.out.println("Tổng các số nguyên tố trong mảng: " + sum);
    }
}
