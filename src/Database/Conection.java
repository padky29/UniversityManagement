package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conection {

    private static final String URL = "jdbc:sqlite:UniversityManagementDatabase/UniversityManagement.sqlite";

    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public static void printAllProfessors() {
        String sql = "SELECT * FROM Professor"; // SQL query to select all records

        try (Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            // Loop through the result set
            while (rs.next()) {
                int id = rs.getInt("ProfessorID");
                String name = rs.getString("Name");
                String role = rs.getString("Role");
                String schedule = rs.getString("Schedule");
                System.out.println("ID: " + id + ", Name: " + name + ", Role: " + role + ", Schedule: " + schedule);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getTableCount(String tableName) {
        String sql = "SELECT COUNT(*) as total FROM " + tableName;
        int count = 0;

        try(Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            if (rs.next()) {
                count = rs.getInt("total");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return count;

    }

}
