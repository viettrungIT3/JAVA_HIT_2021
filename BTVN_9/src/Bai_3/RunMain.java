package Bai_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<News> newsList = new ArrayList<>();

        while (true) {
            System.out.println("\n--------------Menu-------------");
            System.out.println("  1. Insert news");
            System.out.println("  2. View list news");
            System.out.println("  3. Average rate");
            System.out.println("  4. Exit");
            System.out.print("Enter your selection: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("  1. Insert news");

                    News k = new News();
                    System.out.print("Enter id:           ");    k.setId(scanner.nextInt());   scanner.nextLine();
                    System.out.print("Enter title:        ");    k.setTitle(scanner.next());
                    System.out.print("Enter publish Date: ");    k.setPublishDate(scanner.next());
                    System.out.print("Enter author:       ");    k.setAuthor(scanner.next());
                    System.out.print("Enter content:      ");    k.setContent(scanner.next());
                    k.InputRate();
                    newsList.add(k);
                    break;
                case 2: System.out.println("  2. View list news");
                    System.out.printf("%-15s %-20s %-20s %-20s %-20s %-15s", "ID", "Title", "PublishDate", "Author", "Content", "AverageRate");
                    System.out.println();
                    newsList.forEach(News::Display);
                    break;
                case 3: System.out.println("  3. Average rate");
                    System.out.printf("%-15s %-20s %-20s %-20s %-20s %-15s", "ID", "Title", "PublishDate", "Author", "Content", "AverageRate");
                    System.out.println();
                    for (int i = 0; i < newsList.size(); i++) {
                        newsList.get(i).Calculate();
                        newsList.get(i).Display();
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
