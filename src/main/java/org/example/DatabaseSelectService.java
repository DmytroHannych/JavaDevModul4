package org.example;

import java.io.IOException;
import java.sql.SQLException;

public class DatabaseSelectService {
    public static void main(String[] args) throws SQLException, IOException {
        DatabaseQueryService databaseQueryService = new DatabaseQueryService();
         databaseQueryService.findMaxProjectsClient();
        databaseQueryService.findMaxSalaryWorker();
        databaseQueryService.findYoundestEldestWorkers();
        databaseQueryService.findLongestProgect();
        databaseQueryService.findProjectCost();
        databaseQueryService.printList();

    }
}
