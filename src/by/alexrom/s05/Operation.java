package by.alexrom.s05;

import java.util.Scanner;

public class Operation {
    Scanner scanner = new Scanner(System.in);
//    int leftOperand = scanner.nextInt();
//    int rightOperand = scanner.nextInt();
    int res;

    int calculate(int leftOperand, int rightOperand) {
        res = leftOperand + rightOperand;
        return res;
    }

    int returnPrevious() {
        return res;
    }

    public static void main(String[] args) {
        Operation operation = new Operation();
        System.out.println(operation.calculate(12, 15));
        System.out.println(operation.calculate(13, 15));
        System.out.println(operation.returnPrevious());
        Operation o1 = new Addition();
        Operation o2 = new Multiplication();
        System.out.println(o1.calculate(15, 15));
        System.out.println(o2.calculate(15, 15));
        System.out.println(o2.calculate(4, 15));
    }

}
