package task4;

import java.util.Scanner;

public class PhoneNumberFormatChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        PhoneNumber pn = new PhoneNumber(phone);
        System.out.println(pn.getPhoneNumber());

    }
}
