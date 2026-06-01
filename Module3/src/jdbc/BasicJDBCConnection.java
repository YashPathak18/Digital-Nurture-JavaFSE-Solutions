package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BasicJDBCConnection {

    public static void main(String[] args) {

        String url =
                "jdbc:mysql://localhost:3306/studentdb";

        String username = "root";

        String password = "root";

        try {

            // Load JDBC Driver
            Class.forName(
                    "com.mysql.cj.jdbc.Driver"
            );

            // Create Connection
            Connection connection =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            // Create Statement
            Statement statement =
                    connection.createStatement();

            // Execute Query
            String query =
                    "SELECT * FROM students";

            ResultSet resultSet =
                    statement.executeQuery(query);

            System.out.println(
                    "Student Records:"
            );

            while (resultSet.next()) {

                System.out.println(
                        "ID: "
                                + resultSet.getInt("id")
                                + ", Name: "
                                + resultSet.getString("name")
                );
            }

            // Close Resources
            resultSet.close();

            statement.close();

            connection.close();

        } catch (Exception e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}