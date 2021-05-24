
package br.sisacademico.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private static final String urlDB ="jdbc:derby://localhost:1527/SisAcademico2manha";
    private static final String user = "uninove";
    private static String pass ="123";
    public static Connection getConnection()throws SQLException {
        return DriverManager.getConnection(urlDB,user,pass);  
    }
    
}
