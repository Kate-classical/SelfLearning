package by.alexrom.s02;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        fourNumbers(2, 5, 8, 16);
    }


    public static int fourNumbers(int divider, int dividen1, int dividen2, int dividen3) {
        int counter = 0;
        if (dividen1 % divider == 0) {
            System.out.println(dividen1 + " делиться на " + divider + " без остатка");
            counter++;
        }
        if (dividen2 % divider == 0) {
            System.out.println(dividen2 + " делиться на " + divider + " без остатка");
            counter++;
        }
        if (dividen3 % divider == 0) {
            System.out.println(dividen3 + " делиться на " + divider + " без остатка");
            counter++;
        }
        System.out.println("Всего чисел " + counter + " делиться на " + divider);
        return counter;
    }
}