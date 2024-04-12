package org.example.toworkspring.Controllers;

import org.example.toworkspring.DB;
import org.example.toworkspring.Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.List;
import java.util.Map;

@RestController
public class TrackController {
    @GetMapping("/")
    public List<Map<String, Object>> tracks() {
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;

        try {
            connection = DB.connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from appuser");

            List<Map<String, Object>> json = Utils.serializeResultSet(resultSet);

            return json;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try { if (resultSet != null) resultSet.close(); } catch (Exception e) {System.err.println(e.getMessage());}
            try { if (statement != null) statement.close(); } catch (Exception e) {System.err.println(e.getMessage());}
            try { if (connection != null) connection.close(); } catch (Exception e) {System.err.println(e.getMessage());}
        }
        return null;
    }
}
