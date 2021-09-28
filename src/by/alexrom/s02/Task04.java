package by.alexrom.s02;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Введите координаты точки а ");
        int x1 = requestNumber();
        int y1 = requestNumber();
        System.out.println("Введите координаты точки b ");
        int x2 = requestNumber();
        int y2 = requestNumber();
        System.out.println("Растояние между точками = " + calculDist(x1, y1, x2, y2));
    }

    public static double calculDist(int x1, int y1, int x2, int y2) {
        double res = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y1 - y2), 2));
        return res;
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }
}
