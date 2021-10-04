package by.alexrom.s03;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(metod(str1, str2));
    }

    static String metod(String str1, String str2) {
        if (str1.contains(str2)) {
            return str1;
        }
        String s = str2 + str1;
        return s;
    }

}
