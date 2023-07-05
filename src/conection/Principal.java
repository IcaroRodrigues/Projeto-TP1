/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author dyesi
 */
public class Principal {
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/Imobiliaria";
    private static final String user = "root";
    private static final String password = "";

    public static Connection getConnection(){
	try {
	    Class.forName(driver);

	    return DriverManager.getConnection(url, user, password);

	} catch (ClassNotFoundException | SQLException ex) {
	    throw new RuntimeException("Erro na conexão",ex);
	}
	
    }
    public static void closeConnection(Connection con){
	if (con != null) {
	    try {
		con.close();
	    } catch (SQLException ex) {
		// imprime toda a pilha de exceção
		System.err.println("Erro "+ex);
	    }
	}
    }

    // sobrecarga
    public static void closeConnection(Connection con, PreparedStatement stmt){
	if (stmt != null) {
	    try {
		stmt.close();
	    } catch (SQLException ex) {
		// imprime toda a pilha de exceção
		System.err.println("Erro "+ex);
	    }
	}
	closeConnection(con);
    }
    
    // sobrecarga
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
	if (rs != null) {
	    try {
		rs.close();
	    } catch (SQLException ex) {
		// imprime toda a pilha de exceção
		System.err.println("Erro "+ex);
	    }
	}
	closeConnection(con, stmt);
    }
}
