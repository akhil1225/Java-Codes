import java.sql.*;

public class JDBCExample{

    

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/akhil";
    private static final String USER = "root";
    private static final String PASSWORD = "mysql";

    public static void main(String[] args) {
        try {
         // Step 1: Establishing a connection
            Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

            // Step 2: Creating a statement
            Statement statement = connection.createStatement();

            // Step 3: Creating a table (if not exists)
            String createTableQuery = "CREATE TABLE IF NOT EXISTS student (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(255) NOT NULL," +
                    "age INT NOT NULL)";
            statement.executeUpdate(createTableQuery);

            // Step 4: Inserting data
            String insertDataQuery = "INSERT INTO student (name, age) VALUES ('John Doe', 20)";
            statement.executeUpdate(insertDataQuery);

            // Step 5: Modifying data
            String updateDataQuery = "UPDATE student SET age = 21 WHERE name = 'John Doe'";
            statement.executeUpdate(updateDataQuery);

            // Step 6: Retrieving data
            String retrieveDataQuery = "SELECT * FROM student";
            ResultSet resultSet = statement.executeQuery(retrieveDataQuery);

            // Displaying retrieved data
            System.out.println("Student Table:");
            System.out.println("ID\tName\tAge");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println(id + "\t" + name + "\t" + age);
            }

            // Step 7: Deleting data
            String deleteDataQuery = "DELETE FROM student WHERE name = 'John Doe'";
            statement.executeUpdate(deleteDataQuery);

            // Step 8: Closing resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
