package by.alexrom.s02;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        int side1 = requestNumber();
        int side2 = requestNumber();
        int side3 = requestNumber();
        int side4 = requestNumber();

        squerOrRectangle(side1, side2, side3, side4);
    }

    static void squerOrRectangle(int side1, int side2, int side3, int side4) {
        if (side1 == side2 && side2 == side3 && side3 == side4) {
            System.out.println("it is squer");
        }
        if (side1 == side2 && side3 == side4) {
            System.out.println("it is rectangle");
        } else if (side2 == side3 && side1 == side4) {
            System.out.println("it is rectangle");
        }else if (side3 == side1 && side2 == side4) {
            System.out.println("it is rectangle");
        } else {
            System.out.println("it is quadrangle");
        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }
}
