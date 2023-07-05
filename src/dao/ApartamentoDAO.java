/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Classes.Imovel;
import Classes.Apartamento;
import conection.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * CRUD DE APARTAMENTO
 * @author dyesi
 */
public class ApartamentoDAO {
    private Connection con = null;

    public ApartamentoDAO(){
	con = Principal.getConnection();
    }
    
    public boolean salvar(Apartamento apartamento){
	// query para inserir uma nova casa
	String query = "INSERT INTO casa (imovel_id, numeroDoAndar, numeroDoApartamento, qntDeComodos, qntDePavimentos, idadeDoImovel) VALUES (?, ?, ?, ?, ?, ?)";
	PreparedStatement stmt = null;

	try {
	    stmt = con.prepareStatement(query);
	    stmt.setInt(1, apartamento.getId());
	    stmt.setInt(2, apartamento.getNumeroDoAndar());
	    stmt.setInt(3, apartamento.getNumeroDoApartamento());
	    stmt.setInt(4, apartamento.getQntDeComodos());
	    stmt.setInt(5, apartamento.getQntDePavimentos());
	    stmt.setInt(6, apartamento.getIdadeDoImovel());
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

    public boolean editar(Apartamento apartamento){
	// query para inserir um novo imóvel
	String query = "UPDATE imovel SET numeroDoAndar = ?, numeroDoApartamento = ?, qntDeComodos = ?, qntDePavimentos = ?, idadeDoImovel = ?  WHERE id = ?";
	PreparedStatement stmt = null;

	try {
	    stmt = con.prepareStatement(query);
	    stmt.setInt(1, apartamento.getNumeroDoAndar());
	    stmt.setInt(2, apartamento.getNumeroDoApartamento());
	    stmt.setInt(3, apartamento.getQntDeComodos());
	    stmt.setInt(4, apartamento.getQntDePavimentos());
	    stmt.setInt(5, apartamento.getIdadeDoImovel());
	    stmt.setInt(6, apartamento.getId());
	    
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
	String query = "DELETE * FROM apartamento WHERE imovel_id = ?";
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
