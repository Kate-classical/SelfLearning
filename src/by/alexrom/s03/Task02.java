package by.alexrom.s03;

import java.util.Random;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        int n = requestNumber();
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            System.out.print(random.nextInt(n));
        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }

}
