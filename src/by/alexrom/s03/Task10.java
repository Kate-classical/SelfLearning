package by.alexrom.s03;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        metod(str);

    }

    static void metod(String str) {
        String s1 = str.toUpperCase();
        char[] array1 = s1.toCharArray();
        String s2 = str.toLowerCase();
        char[] array2 = s2.toCharArray();
        StringBuilder stringBuilder = new StringBuilder("");

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
            continue;
            }
            stringBuilder.append(str.substring(i,i+1));
        }
        System.out.println(stringBuilder);
    }

}
