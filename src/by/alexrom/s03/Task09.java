package by.alexrom.s03;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        metod(string);
    }

    static void metod(String str) {
        StringBuilder stringBuilder = new StringBuilder("");
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
        }
        StringBuilder stringBuilder1 = new StringBuilder(stringBuilder.reverse());
        String s = stringBuilder1.toString();
        if (str.equals(s)) {
            System.out.println("palinom");
        } else {
            System.out.println("ne palinom");
        }
    }

}
