package by.alexrom.s03;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        char[] array = s.toCharArray();
        StringBuilder stroka = new StringBuilder("");

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <= array[i];j++) {
                stroka.append(array[i]);
            }
            System.out.println(stroka.append(array[i]));
        }
    }
// Не сделано
}


