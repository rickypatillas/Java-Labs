package mysql.sequela_02;

import mysql.Courses;
import mysql.MySQLAccess;

import java.sql.*;
import java.util.ArrayList;

public class Sequela_02 {
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public static void main(String[] args) {

        Sequela_02 example = new Sequela_02();



        try {
            example.readDataBase();
        } catch (Exception e){
            System.out.println("error in readDateBase()" + e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

    public void readDataBase()
            throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connection = DriverManager.getConnection("jdbc:mysql://localhost/University?" +
                    "user=root&password=Notmypassword&useSSL=false");


            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();

            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from University.students;");

            ArrayList<Students> courses = mapResultSetToObjects(resultSet);

            for(Students s : courses){
                System.out.println(s.toString());
            }



        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }




    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {

        }
    }

    private ArrayList<Students> mapResultSetToObjects(ResultSet resultSet) throws SQLException {

        ArrayList<Students> retList = new ArrayList();

        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            Students s = new Students();
            s.setFirst_name(resultSet.getString("f_name"));
            s.setLast_name(resultSet.getString("l_name"));
            s.setLanguage(resultSet.getString("p_language"));
            s.setEmail(resultSet.getString("email"));

            retList.add(s);
        }

        return retList;
    }
}
