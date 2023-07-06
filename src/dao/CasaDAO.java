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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	String query = "INSERT INTO casa (rua, bairro, cep, cidade, valorDaCompra, dataDaAquisicao, disponivel, tamanhoDoLote, areaConstruida, numeroDaCasa, qntDeComodos, qntDePavimentos, idadeDoImovel) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	PreparedStatement stmt = null;

	try {
	    stmt = con.prepareStatement(query);
	    stmt.setString(1, casa.getRua());
	    stmt.setString(2, casa.getBairro());
	    stmt.setString(3, casa.getCep());
	    stmt.setString(4, casa.getCidade());
	    stmt.setDouble(5, casa.getValorDaCompra());
	    stmt.setDate(6,  new java.sql.Date(casa.getDataDaAquisicao().getTime()));
	    stmt.setBoolean(7,  casa.isDisponivel());
	    stmt.setDouble(8, casa.getTamanhoDoLote());
	    stmt.setDouble(9, casa.getAreaConstruida());
	    stmt.setInt(10, casa.getNumeroDaCasa());
	    stmt.setInt(11, casa.getQntDeComodos());
	    stmt.setInt(12, casa.getQntDePavimentos());
	    stmt.setInt(13, casa.getIdadeDoImovel());
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
	String query = "UPDATE casa SET rua = ?, bairro = ?, cep = ?, cidade = ?, valorDaCompra = ?, dataDaAquisicao = ?, disponivel = ?, tamanhoDoLote = ?, areaConstruida = ?, numeroDaCasa = ?, qntDeComodos = ?, qntDePavimentos = ?, idadeDoImovel = ?  WHERE id = ?";
	PreparedStatement stmt = null;

	try {
	    stmt = con.prepareStatement(query);
	    stmt.setString(1, casa.getRua());
	    stmt.setString(2, casa.getBairro());
	    stmt.setString(3, casa.getCep());
	    stmt.setString(4, casa.getCidade());
	    stmt.setDouble(5, casa.getValorDaCompra());
	    stmt.setDate(6,  new java.sql.Date(casa.getDataDaAquisicao().getTime()));
	    stmt.setBoolean(7,  casa.isDisponivel());
	    stmt.setDouble(8, casa.getTamanhoDoLote());
	    stmt.setDouble(9, casa.getAreaConstruida());
	    stmt.setInt(10, casa.getNumeroDaCasa());
	    stmt.setInt(11, casa.getQntDeComodos());
	    stmt.setInt(12, casa.getQntDePavimentos());
	    stmt.setInt(13, casa.getIdadeDoImovel());
	    stmt.setInt(14, casa.getId());
	    
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
    
     public List<Casa> buscarTodos(){
	String query = "SELECT * FROM casa";
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	List<Casa> casas = new ArrayList<>();
	
	try {
	    stmt = con.prepareStatement(query);
	    rs = stmt.executeQuery();

	    while (rs.next()){
		Casa casa = new Casa();
		stmt = con.prepareStatement(query);
		casa.setRua(rs.getString("rua"));
		casa.setBairro(rs.getString("bairro"));
		casa.setCep(rs.getString("cep"));
		casa.setCidade(rs.getString("cidade"));
		casa.setValorDaCompra(rs.getDouble("valorDaCompra"));
		casa.setDataDaAquisicao(rs.getDate("dataDaAquisicao"));
		casa.setDisponivel(rs.getBoolean("disponivel"));
		casa.setTamanhoDoLote(rs.getDouble("tamanhoDoLote"));
		casa.setAreaConstruida(rs.getDouble("areaConstruida"));
		casa.setNumeroDaCasa(rs.getInt("numeroDaCasa"));
		casa.setQntDeComodos(rs.getInt("qntDeComodos"));
		casa.setQntDePavimentos(rs.getInt("qntDePavimentos"));
		casa.setIdadeDoImovel(rs.getInt("idadeDoImovel"));
		casas.add(casa);
	    }

	} catch (SQLException ex) {
	    System.out.println("Erro: "+ex);
	} finally {
	    Principal.closeConnection(con, stmt, rs);
	}

	return casas;

    }
    public boolean excluir(Imovel imovel){
	// query para inserir um novo imóvel
	String query = "DELETE * FROM casa WHERE id = ?";
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
