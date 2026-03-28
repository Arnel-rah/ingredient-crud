package hei.school.ingredientcrud.repository;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DataSource {
    @Value("${db.url}")
    private String url;
    @Value("${db.name}")
    private String dbName;
    @Value("${db.username}")
    private String username;

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(url, username, dbName);
        }catch (SQLException e){
            throw new RuntimeException("Erreur de connection de base de données", e);
        }
    }
}
