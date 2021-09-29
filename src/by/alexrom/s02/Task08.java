package by.alexrom.s02;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        int a = requestNumber();
        int b = requestNumber();
        twoNumbers(a, b);
    }

    static void twoNumbers(int one, int two) {
        if ((one % two) / 2 == 0) {
            System.out.println("частное = " + (one / two));
        } else {
            System.out.println("остаток = " + (one % two));
        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }

}
