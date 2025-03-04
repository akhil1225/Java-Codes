import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class 25{ 
        public static void main(String[] args) {
        // Database connection parameters
        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        // SQL query with placeholders for parameters
        String insertQuery = "INSERT INTO users (username, email) VALUES (?, ?)";

        try (
            // Establish a database connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Create a PreparedStatement with the SQL query
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)
        ) {
            // Set values for parameters
            preparedStatement.setString(1, "john_doe");
            preparedStatement.setString(2, "john.doe@example.com");

            // Execute the prepared statement
            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println(rowsAffected + " row(s) inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
