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
	String query = "INSERT INTO apartamento (rua, bairro, cep, cidade, valorDaCompra, dataDaAquisicao, disponivel, numeroDoAndar, numeroDoApartamento, qntDeComodos, qntDePavimentos, idadeDoImovel) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	PreparedStatement stmt = null;

	try {
	    stmt = con.prepareStatement(query);
	    stmt.setString(1, apartamento.getRua());
	    stmt.setString(2, apartamento.getBairro());
	    stmt.setString(3, apartamento.getCep());
	    stmt.setString(4, apartamento.getCidade());
	    stmt.setDouble(5, apartamento.getValorDaCompra());
	    stmt.setDate(6,  new java.sql.Date(apartamento.getDataDaAquisicao().getTime()));
	    stmt.setBoolean(7,  apartamento.isDisponivel());
	    stmt.setInt(8, apartamento.getNumeroDoAndar());
	    stmt.setInt(9, apartamento.getNumeroDoApartamento());
	    stmt.setInt(10, apartamento.getQntDeComodos());
	    stmt.setInt(11, apartamento.getQntDePavimentos());
	    stmt.setInt(12, apartamento.getIdadeDoImovel());
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
	String query = "UPDATE apartamento SET rua = ?, bairro = ?, cep = ?, cidade = ?, valorDaCompra = ?, dataDaAquisicao = ?, disponivel = ?, numeroDoAndar = ?, numeroDoApartamento = ?, qntDeComodos = ?, qntDePavimentos = ?, idadeDoImovel = ?  WHERE id = ?";
	PreparedStatement stmt = null;

	try {
	    stmt = con.prepareStatement(query);
	    stmt.setString(1, apartamento.getRua());
	    stmt.setString(2, apartamento.getBairro());
	    stmt.setString(3, apartamento.getCep());
	    stmt.setString(4, apartamento.getCidade());
	    stmt.setDouble(5, apartamento.getValorDaCompra());
	    stmt.setDate(6,  new java.sql.Date(apartamento.getDataDaAquisicao().getTime()));
	    stmt.setBoolean(7,  apartamento.isDisponivel());
	    stmt.setInt(8, apartamento.getNumeroDoAndar());
	    stmt.setInt(9, apartamento.getNumeroDoApartamento());
	    stmt.setInt(10, apartamento.getQntDeComodos());
	    stmt.setInt(11, apartamento.getQntDePavimentos());
	    stmt.setInt(12, apartamento.getIdadeDoImovel());
	    stmt.setInt(13, apartamento.getId());
	    
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
	String query = "DELETE * FROM apartamento WHERE id = ?";
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
