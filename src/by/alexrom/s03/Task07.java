package by.alexrom.s03;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine();
        String simvol = scanner.nextLine();
        char c = simvol.charAt(0);
        metod(stroka, c);
    }

    static void metod(String stroka, Character simvol) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = stroka.toCharArray();

        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            if (array[i] == simvol) {
                stringBuilder.replace(i, i+1, String.valueOf(simvol).toUpperCase());
            }
        }
        System.out.println(stringBuilder);
    }

}
