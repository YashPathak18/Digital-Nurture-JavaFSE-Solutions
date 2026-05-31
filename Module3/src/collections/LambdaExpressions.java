package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressions {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Yash");
        names.add("Aman");
        names.add("Riya");
        names.add("Kunal");

        System.out.println("Before Sorting:");
        System.out.println(names);

        Collections.sort(names,
                (a, b) -> a.compareTo(b)
        );

        System.out.println("\nAfter Sorting:");
        System.out.println(names);
    }
}