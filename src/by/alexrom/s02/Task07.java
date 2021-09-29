package by.alexrom.s02;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        int n = requestNumber();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = requestNumber();
        }
        function(array);
    }

    static void function(int[] array) {
        int sum = 0;
        int proizved = 1;
        for (int i = 0; i < array.length; i++) {
            int cheak = array[i];
            if (cheak % 2 == 0) {
                sum = sum + cheak;
            } else {
                proizved = proizved * cheak;
            }
        }
        System.out.println("Сумма сума четных = " + sum);
        System.out.println("Произведение нечетных чисел = " + proizved);
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }
}
