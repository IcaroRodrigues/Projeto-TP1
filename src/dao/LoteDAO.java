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
	String query = "INSERT INTO lote (rua, bairro, cep, cidade, valorDaCompra, dataDaAquisicao, disponivel, numeroDoLote, areaDoLote) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	PreparedStatement stmt = null;

	try {
	    stmt = con.prepareStatement(query);
	    stmt.setString(1, lote.getRua());
	    stmt.setString(2, lote.getBairro());
	    stmt.setString(3, lote.getCep());
	    stmt.setString(4, lote.getCidade());
	    stmt.setDouble(5, lote.getValorDaCompra());
	    stmt.setDate(6,  new java.sql.Date(lote.getDataDaAquisicao().getTime()));
	    stmt.setBoolean(7,  lote.isDisponivel());
	    stmt.setInt(8, lote.getNumeroDoLote());
	    stmt.setDouble(9, lote.getAreaDoLote());
	    
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
	String query = "UPDATE lote SET rua = ?, bairro = ?, cep = ?, cidade = ?, valorDaCompra = ?, dataDaAquisicao = ?, disponivel = ?, numeroDoLote = ?, areaDoLote = ?  WHERE id = ?";
	PreparedStatement stmt = null;

	try {
	    stmt = con.prepareStatement(query);
	    stmt.setString(1, lote.getRua());
	    stmt.setString(2, lote.getBairro());
	    stmt.setString(3, lote.getCep());
	    stmt.setString(4, lote.getCidade());
	    stmt.setDouble(5, lote.getValorDaCompra());
	    stmt.setDate(6,  new java.sql.Date(lote.getDataDaAquisicao().getTime()));
	    stmt.setBoolean(7,  lote.isDisponivel());
	    stmt.setInt(8, lote.getNumeroDoLote());
	    stmt.setDouble(9, lote.getAreaDoLote());
	    stmt.setInt(10, lote.getId());
	    
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
	String query = "DELETE * FROM lote WHERE id = ?";
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
