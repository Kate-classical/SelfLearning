package by.alexrom.s02;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        System.out.println("Выбери тип калькулятора");
        System.out.println("1: Цельсий в фарингейт");
        System.out.println("2: фариншейт в цельсий");
        System.out.println("3: км в милли");
        System.out.println("4: милли в км");
        System.out.println("5: кг - фут");
        System.out.println("6: фут - кг");
        System.out.println("7: литр - галон");
        System.out.println("8: галон - литр");

        int number = requestNumber();
        calculator(number);
    }

    static void calculator(int number) {
        switch (number) {
            case 1:
                int a = requestNumber();
                System.out.println((a * 9 / 5) + 32);
                break;
            case 2:
                int a2 = requestNumber();
                System.out.println((a2 - 32) * 5 / 9);
                break;
            case 3:
                int a3 = requestNumber();
                double res = a3 / 1.609;
                System.out.println(res);
                break;
            case 4:
                double a4 = requestNumber();
                double res1 = a4 * 1.609;
                System.out.println(res1);
                break;
            case 5:
                int a5 = requestNumber();
                double res2 = a5*2.205;
                System.out.println(res2);
                break;
            case 6:
                int a6 = requestNumber();
                double res3 = a6/2.205;
                System.out.println(a6);
                break;
            case 7:
                int a7 = requestNumber();
                double res7 = a7/3.785;
                System.out.println(res7);
                break;
            case 8:
                int a8 = requestNumber();
                double res8 = a8*3.785;
                System.out.println(res8);
                break;

        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }
}
