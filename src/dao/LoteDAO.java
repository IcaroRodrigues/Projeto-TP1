/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Classes.Imovel;
import Classes.Lote;
import conection.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * CRUD DE LOTE
 * @author dyesi
 */
public class LoteDAO {
    private Connection con = null;

    public LoteDAO(){
	con = Principal.getConnection();
    }
    
    public boolean salvar(Lote lote){
	// query para inserir um novo imóvel
	String query = "INSERT INTO lote (imovel_id, numeroDoLote, areaDoLote) VALUES (?, ?, ?)";
	PreparedStatement stmt = null;

	try {
	    stmt = con.prepareStatement(query);
	    stmt.setInt(1, lote.getId());
	    stmt.setInt(2, lote.getNumeroDoLote());
	    stmt.setDouble(3, lote.getAreaDoLote());
	    
	    // salva os dados no bd
	    stmt.executeUpdate();
	    return true;
	} catch (SQLException ex) {
	    System.out.println("erro: "+ex);
	    System.out.println("é aq que ta dando erro");
	    return false;
	} finally {
	    Principal.closeConnection(con, stmt);
	}
    }

    public boolean editar(Lote lote){
	// query para inserir um novo imóvel
	String query = "UPDATE imovel SET numeroDoLote = ?, areaDoLote = ?  WHERE id = ?";
	PreparedStatement stmt = null;

	try {
	    stmt = con.prepareStatement(query);
	    stmt.setInt(1, lote.getNumeroDoLote());
	    stmt.setDouble(2, lote.getAreaDoLote());
	    stmt.setInt(3, lote.getId());
	    
	    // salva os dados no bd
	    stmt.executeUpdate();
	    return true;
	} catch (SQLException ex) {
	    System.out.println("erro: "+ex);
	    return false;
	} finally {
	    Principal.closeConnection(con, stmt);
	}
    }

    public boolean excluir(Imovel imovel){
	// query para inserir um novo imóvel
	String query = "DELETE * FROM lote WHERE imovel_id = ?";
	PreparedStatement stmt = null;

	try {
	    stmt.setInt(1, imovel.getId());
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
