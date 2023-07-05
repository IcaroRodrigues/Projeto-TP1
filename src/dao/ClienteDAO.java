/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Classes.Cliente;
import conection.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * CRUD DE CLIENTE
 * @author dyesi
 */
public class ClienteDAO {
    private Connection con = null;

    public ClienteDAO(){
	con = Principal.getConnection();
    }
    
    
    
    public boolean excluir(Cliente cliente){
	// query para inserir um novo imóvel
	String query = "DELETE * FROM cliente WHERE id = ?";
	PreparedStatement stmt = null;

	try {
	    stmt.setInt(1, cliente.getId());
	    // executa a query no bd
	    stmt.executeUpdate();
	    return true;
	} catch (SQLException ex) {
	    System.out.println("erro: "+ex);
	    return false;
	} finally {
	    Principal.closeConnection(con, stmt);
	}
    }
}
