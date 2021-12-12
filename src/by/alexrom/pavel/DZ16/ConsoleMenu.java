package by.alexrom.pavel.DZ16;

import java.util.Collections;
import java.util.Scanner;

public class ConsoleMenu {

    private Shop shop = new Shop();
    private Scanner scanner = new Scanner(System.in);

    void menu() {
        System.out.println("Welcome to the shop! Chose what you want to do");
        System.out.println("1 - get all products");
        System.out.println("2 - add products");
        System.out.println("3 - remove product");
        int choice = scanner.nextInt();

        switch(choice) {

            case 1:
                System.out.println("1 - Get all products sorted by increasing prise or 2 - by decreasing");
                int choice2 = scanner.nextInt();
                if(choice2 == 1) {
                    shop.compareProductByPrice();
                } else if(choice2 == 2) {
                    shop.getAllProducts().sort(Collections.reverseOrder());
                }
                break;

            case 2:
                do {
                    int id = scanner.nextInt();
                    String name = scanner.next();
                    int price = scanner.nextInt();
                    shop.addProduct(new Product(id, name, price));
                    System.out.println("continua 1 end 2 ");
                } while(scanner.nextInt() != 2);
                break;

            case 3:
                do {
                    int id = scanner.nextInt();
                    shop.removeProductById(id);
                    System.out.println("continua 1 end 2 ");
                } while(scanner.nextInt() != 2);
                break;

            case 4:
        }
    }
}
