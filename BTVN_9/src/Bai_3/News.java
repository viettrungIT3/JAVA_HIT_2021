package Bai_3;

import java.util.Scanner;

public class News implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void Display() {
        System.out.printf("%-15d %-20s %-20s %-20s %-20s %-15.2f", getId(), getTitle(), getPublishDate(), getAuthor(), getContent(), getAverageRate());
        System.out.println();
    }

    public int []rateList = new int[3];

    public void InputRate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter in turn 3 point: ");
        for (int i = 0; i < 3; i++) {
            rateList[i] = scanner.nextInt();
        }
    }

    public void Calculate() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += rateList[i];
        }
        this.averageRate = (float)sum/ 3;
    }
}
