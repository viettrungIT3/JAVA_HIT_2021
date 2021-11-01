package Bai_1;

import java.util.Scanner;

public class RunMain {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Person ps1 = new Person("Trung", 21, "Male", "Code");
        Person ps2 = new Person();

        System.out.print("Enter name: ");
        ps2.setName(scanner.nextLine());
        System.out.print("Enter age: ");
        ps2.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter gender: ");
        ps2.setGender(scanner.nextLine());
        System.out.print("Enter hobby: ");
        ps2.setHobby(scanner.nextLine());

        System.out.println("The information of person 1: " + ps1.toString());
        System.out.println("The information of person 2: " + ps2.toString());
    }
}
