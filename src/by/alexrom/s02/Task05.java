package by.alexrom.s02;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        int num1 = requestNumber();
        int num2 = requestNumber();
        int num3 = requestNumber();
        isPifagorNumbers(num1, num2, num3);
    }

    static void isPifagorNumbers(int num1, int num2, int num3) {
        if ((num1 * num1) + (num2 * num2) == (num3 * num3)) {
            System.out.println(num1 + " " + num2 + " " + num3 + " is Pifagor numbers");
        }else if ((num2 * num2) + (num3 * num3) == (num1 * num1)) {
            System.out.println(num1 + " " + num2 + " " + num3 + " is Pifagor numbers");
        }else if ((num3 * num3) + (num1 * num1) == (num2 * num2)) {
            System.out.println(num1 + " " + num2 + " " + num3 + " is Pifagor numbers");
        }else {
            System.out.println(num1 + " " + num2 + " " + num3 + " is not Pifagor numbers");
        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }
}
