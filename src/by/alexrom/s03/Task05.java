package by.alexrom.s03;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("fio1");
        String fio1 = scanner.nextLine();
        System.out.println("fio2");
        String fio2 = scanner.nextLine();

        if (fio1.equals(fio2)){
            System.out.println("тезками");
        }else {
            System.out.println("ne тезками");
        }
    }
}
