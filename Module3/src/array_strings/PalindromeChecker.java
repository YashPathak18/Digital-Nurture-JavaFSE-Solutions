package array_strings;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedString = input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        String reversedString = new StringBuilder(cleanedString)
                .reverse()
                .toString();

        if (cleanedString.equals(reversedString)) {

            System.out.println("The string is a Palindrome.");

        } else {

            System.out.println("The string is not a Palindrome.");
        }

        sc.close();
    }
}