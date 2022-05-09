package JDBC;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Main {

    static Connection connection;

    public static void main(String[] args) {

        dbconnection();

    }

       /* String username = "hd";
        String email = "hicri@aky-tech.com";
        String fullname = "Hicri DIRIK";
        String password = "hd.q1w2e3r4t5";*/

            /*String SQL = "SELECT * FROM users ";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL);

            while (resultSet.next()) {
                int userId = resultSet.getInt("user_id");
                String username = resultSet.getString("username");
                String fullname = resultSet.getString("fullname");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                System.out.println(userId + ", "+ username + ", " + fullname + ", " + email + ", " + password); */

        //3
                /*String username = resultSet.getString("username");
                System.out.println(username);
            }*/


        //2
            /*String SQL = "INSERT INTO users (username, email, fullname, password)" + "VALUES (?, ?, ?,?)";

            PreparedStatement statement = connection.prepareStatement(SQL);
            statement.setString(1,username);
            statement.setString(2,email);
            statement.setString(3,fullname);
            statement.setString(4,password);

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("A new user added db successfully..");
            }*/

        //1
            /*String SQL = "INSERT INTO users (username, email, fullname, password)"
            + "VALUES ('mva', 'veli@aky-tech.com', 'Veli AKYOL','Akytech.12')";
            Statement statement = connection.createStatement();

            int rows = statement.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("A new user added db successfully..");
            }*/


    public static void dbconnection() {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Akytech.q1w2");
            String SQL = "UPDATE users SET password = 'muveak90' WHERE username='mva'";
            Statement statement = connection.createStatement();

            int rows = statement.executeUpdate(SQL);
            if (rows > 0) {
                System.out.println("The user's info updated to the db successfully..");

            }

            connection.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}


