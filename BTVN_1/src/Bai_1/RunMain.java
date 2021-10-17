package Bai_1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {

        int m = 5, n = 8;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                if ( i == 0 || j == 0 || i == m-1 || j == n-1)
                    System.out.printf("*  ");
                else
                    System.out.printf("   ");
            System.out.println();
        }
    }
}
