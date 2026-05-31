package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> studentMap = new HashMap<>();

        System.out.print("Enter number of students: ");
        int count = sc.nextInt();

        sc.nextLine();

        for (int i = 1; i <= count; i++) {

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            studentMap.put(id, name);
        }

        System.out.print("\nEnter Student ID to search: ");

        int searchId = sc.nextInt();

        if (studentMap.containsKey(searchId)) {

            System.out.println(
                    "Student Name: " + studentMap.get(searchId)
            );

        } else {

            System.out.println("Student ID not found.");
        }

        sc.close();
    }
}