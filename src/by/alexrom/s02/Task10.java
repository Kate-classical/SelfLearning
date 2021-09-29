package by.alexrom.s02;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        int radius = requestNumber();
        function(radius);
    }

    static void function(int radius) {
        double plo = 3.14 * (radius*radius);
        System.out.println("плошадь круга" + plo);
        double dlina = 2 * 3.14 * radius;
        System.out.println("Длиина круга" + dlina);
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }
}
