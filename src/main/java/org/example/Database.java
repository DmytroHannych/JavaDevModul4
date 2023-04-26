package org.example;

import java.sql.*;


public class Database  {

    public static final String DB_TEST = "jdbc:h2:~/test1";
    public static final Database DATABASE = new Database();
    private Connection connection;

    private Database (){
        try {
            connection = DriverManager.getConnection(DB_TEST);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Database getInstance(){
        return DATABASE;
    }

    public int executeUpdate(String  sql){

        try (Statement st = connection.createStatement()){
           return st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    private ResultSet executeQure(String sql){

        try (Statement st = connection.createStatement()){
            return st.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Connection getConnection(){
        return connection;
    }
    public void close()  {
        try {
            connection.close();
        } catch (SQLException e) {
           e.printStackTrace();
        }
    }
}
