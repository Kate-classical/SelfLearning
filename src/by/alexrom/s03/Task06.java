package by.alexrom.s03;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        metod(string);

    }

    static void metod(String string) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            count++;
        }
        if (count % 2 == 0) {
            String s = string.substring(count / 2);
            String s2 = string.substring(0, count / 2);
            stringBuilder.append(s).append(s2);
            System.out.println(stringBuilder);

        }
    }
}
