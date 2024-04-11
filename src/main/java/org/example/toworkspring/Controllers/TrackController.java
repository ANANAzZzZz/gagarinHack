package org.example.toworkspring.Controllers;

import org.example.toworkspring.DB;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Controller
public class TrackController {
    @GetMapping("/")
    public String tracks() {
        try (var connection =  DB.connect()){
            System.out.println("Connected to the PostgreSQL database.");
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("select * from appuser");

            while (result.next()) {
                System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3));
            }

            result.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return "tracks";
    }
}
