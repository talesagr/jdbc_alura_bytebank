package br.com.alura.bytebank;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return createDataSource().getConnection();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    private HikariDataSource createDataSource(){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/byte_bank");
        config.setUsername("tales");
        config.setPassword("a9x35fx0");
        config.setMaximumPoolSize(10);

        return new HikariDataSource(config);
    }
}

