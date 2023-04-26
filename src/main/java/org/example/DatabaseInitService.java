package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseInitService {
    public static final String INIT_DB = "sql/init_db.sql";
    public static void main(String[] args) throws SQLException {

        Database database = Database.getInstance();
        try {
            String sql = String.join(
                    "\n",
                    Files.readAllLines(Paths.get(INIT_DB)));
            database.executeUpdate(sql);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
