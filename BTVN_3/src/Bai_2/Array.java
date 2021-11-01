package Bai_2;

import java.util.Scanner;

public class Array {
    private int[] arr;
    private int num;

    public Array() {
    }

    public Array(int[] arr, int num) {
        this.arr = arr;
        this.num = num;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void InputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n = ");
        num = scanner.nextInt();
        arr = new int[num];
        System.out.print("Enter array: ");
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public void Show() {
        System.out.print("Show array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public int Sum() {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    public void Filter(boolean flag) {
        if (flag) {
            System.out.print("Even numbers in the array: ");
            for ( int val : arr) {
                if ( val % 2 == 0) {
                    System.out.print( val + " ");
                }
            }
        } else {
            System.out.print("Odd numbers in the array: ");
            for ( int val : arr) {
                if ( val % 2 != 0) {
                    System.out.print( val + " ");
                }
            }
        }
    }
}
