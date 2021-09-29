package by.alexrom.s02;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        int b = requestNumber();
        TrehZnacnoeChislo(b);
    }

    public static void TrehZnacnoeChislo(int number) {
        int sum = 0;
        if (number > 99 && number < 1000) {
            String s = Integer.toString(number);
            char[] charArray = s.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                int a = Character.getNumericValue(charArray[i]);
                sum += a;
            }
            System.out.println(sum);
        } else {
            System.out.println("Не трехзначное число!");
        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }
}
