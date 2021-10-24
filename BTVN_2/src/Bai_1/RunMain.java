package Bai_1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();
        System.out.print("Enter c = ");
        int c = sc.nextInt();

        System.out.println("Max(" + a + "," + b + "," + c + ") = " + Max3(a, b, c));
    }

    public static int Max3(int a, int b, int c) {
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }
}
