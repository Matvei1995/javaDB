package com.address.model;
import java.sql.*;

import static com.address.model.Env.*;
public class Database {
    private static final Connection connexion;
    static {
        try {
            connexion = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnexion(){
        return connexion;
    }
}