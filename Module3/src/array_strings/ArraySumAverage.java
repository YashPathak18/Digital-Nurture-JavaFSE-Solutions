
package array_strings;

import java.util.Scanner;

public class ArraySumAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        int sum = 0;

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {

            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / size;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        sc.close();
    }
}