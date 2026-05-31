
package basics;

public class TypeCastingExample {

    public static void main(String[] args) {

        double doubleNumber = 45.67;

        int intNumber = (int) doubleNumber;

        System.out.println("Double Value: " + doubleNumber);
        System.out.println("Converted Integer Value: " + intNumber);

        int anotherInt = 25;

        double convertedDouble = anotherInt;

        System.out.println("Integer Value: " + anotherInt);
        System.out.println("Converted Double Value: " + convertedDouble);
    }
}