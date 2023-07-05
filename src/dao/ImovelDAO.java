/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Classes.Imovel;

import conection.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * CRUD de Imóvel
 * @author dyesi
 */
public class ImovelDAO {
    private Connection con = null;

    public ImovelDAO(){
	con = Principal.getConnection();
    }

    public boolean salvar(Imovel imovel){
	// query para inserir um novo imóvel
	String query = "INSERT INTO Imovel (rua, bairro, cep, cidade, valorDaCompra, dataDaAquisicao) VALUES (?, ?, ?, ?, ?, ?)";
	PreparedStatement stmt = null;

	try {
	    stmt = con.prepareStatement(query);
	    stmt.setString(1, imovel.getRua());
	    stmt.setString(2, imovel.getBairro());
	    stmt.setString(3, imovel.getCep());
	    stmt.setString(4, imovel.getCidade());
	    stmt.setDouble(5, imovel.getValorDaCompra());
	    stmt.setDate(6,  new java.sql.Date(imovel.getDataDaAquisicao().getTime()));
	    
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

    // nesse caso só vai ter a busca de todos em cada um lote, casa e apto
    public List<Imovel> buscarTodos(){
	String query = "SELECT * FROM imovel";
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	List<Imovel> imoveis = new ArrayList<>();
	
	try {
	    stmt = con.prepareStatement(query);
	    rs = stmt.executeQuery();

	    while (rs.next()){
		Imovel imovel = new Imovel();
		//Imovel(rua, bairro, cep, cidade, valorDaCompra, dataDaAquisicao);
		imovel.setRua(rs.getString("rua"));
		imovel.setBairro(rs.getString("bairro"));
		imovel.setCep(rs.getString("cep"));
		imovel.setCidade(rs.getString("cidade"));
		imovel.setValorDaCompra(rs.getDouble("valorDaCompra"));
		imovel.setDataDaAquisicao(rs.getDate("dataDaAquisicao"));
	    }

	} catch (SQLException ex) {
	    System.out.println("Erro: "+ex);
	} finally {
	    Principal.closeConnection(con, stmt, rs);
	}

	return imoveis;

    }

    public boolean editar(Imovel imovel){
	// query para inserir um novo imóvel
	String query = "UPDATE imovel SET rua = ?, bairro = ?, cep = ?, cidade = ?, valorDaCompra = ?, dataDaAquisicao = ?  WHERE id = ?";
	PreparedStatement stmt = null;

	try {
	    stmt = con.prepareStatement(query);
	    stmt.setString(1, imovel.getRua());
	    stmt.setString(2, imovel.getBairro());
	    stmt.setString(3, imovel.getCep());
	    stmt.setString(4, imovel.getCidade());
	    stmt.setDouble(5, imovel.getValorDaCompra());
	    stmt.setDate(6,  new java.sql.Date(imovel.getDataDaAquisicao().getTime()));
	    stmt.setInt(7, imovel.getId());
	    
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
	String query = "DELETE * FROM imovel WHERE id = ?";
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
