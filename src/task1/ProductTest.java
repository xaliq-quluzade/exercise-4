package task1;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product name: ");
        Product product1 = new Product(scanner.nextLine());
        product1.printInfo();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter the product name: ");
        Product product2 = new Product(scanner2.nextLine());
        product2.printInfo();
    }
}