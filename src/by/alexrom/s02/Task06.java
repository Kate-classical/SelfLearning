package by.alexrom.s02;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        int num = requestNumber();
        spreadsheet(num);
    }

    static void spreadsheet(int num) {
        int res = 0;
        for (int i = 1; i < 11; i++) {
            res = num * i;
            System.out.println(num + " умножить на " + i + " = " + res);
        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }
}
