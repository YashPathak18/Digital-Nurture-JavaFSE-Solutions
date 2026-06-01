package advanced_java;

import java.lang.reflect.Method;

class Student {

    public void displayMessage() {

        System.out.println(
                "Reflection in Java"
        );
    }

    public void showDetails(
            String name,
            int age
    ) {

        System.out.println(
                "Name: " + name
                        + ", Age: " + age
        );
    }
}

public class ReflectionExample {

    public static void main(String[] args) {

        try {

            // Load Class Dynamically
            Class<?> cls =
                    Class.forName(
                            "advanced_java.Student"
                    );

            // Create Object
            Object obj =
                    cls.getDeclaredConstructor()
                            .newInstance();

            // Get All Methods
            Method[] methods =
                    cls.getDeclaredMethods();

            System.out.println(
                    "Methods in Student Class:"
            );

            for (Method method : methods) {

                System.out.println(
                        method.getName()
                );
            }

            // Invoke displayMessage()
            Method displayMethod =
                    cls.getMethod(
                            "displayMessage"
                    );

            displayMethod.invoke(obj);

            // Invoke showDetails()
            Method detailsMethod =
                    cls.getMethod(
                            "showDetails",
                            String.class,
                            int.class
                    );

            detailsMethod.invoke(
                    obj,
                    "Yash",
                    21
            );

        } catch (Exception e) {

            System.out.println(
                    "Reflection Error: "
                            + e.getMessage()
            );
        }
    }
}