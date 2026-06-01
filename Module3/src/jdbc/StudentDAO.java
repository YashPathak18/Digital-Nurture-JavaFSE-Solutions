package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO {

    String url =
            "jdbc:mysql://localhost:3306/studentdb";

    String username = "root";

    String password = "root";

    // Insert Student Record
    public void insertStudent(
            int id,
            String name
    ) {

        String query =
                "INSERT INTO students VALUES (?, ?)";

        try {

            Connection connection =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            PreparedStatement preparedStatement =
                    connection.prepareStatement(query);

            preparedStatement.setInt(1, id);

            preparedStatement.setString(2, name);

            int rows =
                    preparedStatement.executeUpdate();

            System.out.println(
                    rows + " record inserted."
            );

            preparedStatement.close();

            connection.close();

        } catch (Exception e) {

            System.out.println(
                    "Insert Error: "
                            + e.getMessage()
            );
        }
    }

    // Update Student Record
    public void updateStudent(
            int id,
            String newName
    ) {

        String query =
                "UPDATE students SET name=? WHERE id=?";

        try {

            Connection connection =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            PreparedStatement preparedStatement =
                    connection.prepareStatement(query);

            preparedStatement.setString(1, newName);

            preparedStatement.setInt(2, id);

            int rows =
                    preparedStatement.executeUpdate();

            System.out.println(
                    rows + " record updated."
            );

            preparedStatement.close();

            connection.close();

        } catch (Exception e) {

            System.out.println(
                    "Update Error: "
                            + e.getMessage()
            );
        }
    }

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        dao.insertStudent(101, "Yash");

        dao.updateStudent(101, "Yash Pathak");
    }
}