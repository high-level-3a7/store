/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class DataSource {
     private static DataSource instance;
    private Connection cnx;

    private final String URL = "jdbc:mysql://localhost:3306/SPORTLEAD";
    private final String LOGIN = "root";
    private final String PASSWORD = "";

    DataSource() {
        try {
            cnx = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            System.out.println("Conncting !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static DataSource getInstance() {
        if (instance == null) {
            instance = new DataSource();
        }
        return instance;
    }   

    public Connection getCnx() {
   return cnx ; }

    

   
}
