/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Classes.Imovel;
import Classes.Casa;
import conection.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * CRUD DE CASA
 * @author dyesi
 */
public class CasaDAO {
    private Connection con = null;

    public CasaDAO(){
	con = Principal.getConnection();
    }
    
    public boolean salvar(Casa casa){
	// query para inserir uma nova casa
	String query = "INSERT INTO casa (imovel_id, tamanhoDoLote, areaConstruida, numeroDaCasa, qntDeComodos, qntDePavimentos, idadeDoImovel) VALUES (?, ?, ?, ?, ?, ?, ?)";
	PreparedStatement stmt = null;

	try {
	    stmt = con.prepareStatement(query);
	    stmt.setInt(1, casa.getId());
	    stmt.setDouble(2, casa.getTamanhoDoLote());
	    stmt.setDouble(3, casa.getAreaConstruida());
	    stmt.setInt(4, casa.getNumeroDaCasa());
	    stmt.setInt(5, casa.getQntDeComodos());
	    stmt.setInt(6, casa.getQntDePavimentos());
	    stmt.setInt(7, casa.getIdadeDoImovel());
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

    public boolean editar(Casa casa){
	// query para inserir um novo imóvel
	String query = "UPDATE imovel SET tamanhoDoLote = ?, areaConstruida = ?, numeroDaCasa = ?, qntDeComodos = ?, qntDePavimentos = ?, idadeDoImovel = ?  WHERE id = ?";
	PreparedStatement stmt = null;

	try {
	    stmt = con.prepareStatement(query);
	    stmt.setDouble(1, casa.getTamanhoDoLote());
	    stmt.setDouble(2, casa.getAreaConstruida());
	    stmt.setInt(3, casa.getNumeroDaCasa());
	    stmt.setInt(4, casa.getQntDeComodos());
	    stmt.setInt(5, casa.getQntDePavimentos());
	    stmt.setInt(6, casa.getIdadeDoImovel());
	    stmt.setInt(7, casa.getId());
	    
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
	String query = "DELETE * FROM casa WHERE imovel_id = ?";
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
