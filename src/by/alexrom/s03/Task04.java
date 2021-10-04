package by.alexrom.s03;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String c = scanner.next();
        int occurrencesCount = string.length() - string.replace(c, "").length();
        System.out.println(occurrencesCount);

    }
}
