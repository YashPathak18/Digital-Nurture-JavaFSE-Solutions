package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionHandling {

    static final String URL =
            "jdbc:mysql://localhost:3306/bankdb";

    static final String USER =
            "root";

    static final String PASSWORD =
            "root";

    public static void transferMoney(
            int senderId,
            int receiverId,
            double amount
    ) {

        Connection connection = null;

        try {

            connection =
                    DriverManager.getConnection(
                            URL,
                            USER,
                            PASSWORD
                    );

            // Disable Auto Commit
            connection.setAutoCommit(false);

            // Debit Query
            String debitQuery =
                    "UPDATE accounts "
                            + "SET balance = balance - ? "
                            + "WHERE id = ?";

            PreparedStatement debitStatement =
                    connection.prepareStatement(
                            debitQuery
                    );

            debitStatement.setDouble(1, amount);

            debitStatement.setInt(2, senderId);

            debitStatement.executeUpdate();

            // Credit Query
            String creditQuery =
                    "UPDATE accounts "
                            + "SET balance = balance + ? "
                            + "WHERE id = ?";

            PreparedStatement creditStatement =
                    connection.prepareStatement(
                            creditQuery
                    );

            creditStatement.setDouble(1, amount);

            creditStatement.setInt(2, receiverId);

            creditStatement.executeUpdate();

            // Commit Transaction
            connection.commit();

            System.out.println(
                    "Transaction Successful."
            );

        } catch (Exception e) {

            try {

                if (connection != null) {

                    connection.rollback();

                    System.out.println(
                            "Transaction Rolled Back."
                    );
                }

            } catch (Exception rollbackException) {

                System.out.println(
                        rollbackException.getMessage()
                );
            }

            System.out.println(
                    "Transaction Error: "
                            + e.getMessage()
            );

        } finally {

            try {

                if (connection != null) {

                    connection.close();
                }

            } catch (Exception e) {

                System.out.println(
                        e.getMessage()
                );
            }
        }
    }

    public static void main(String[] args) {

        transferMoney(1, 2, 5000);
    }
}