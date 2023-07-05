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
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * CRUD DE CLIENTE
 * @author dyesi
 */
public class ClienteDAO {
    private Connection con = null;

    public ClienteDAO(){
	con = Principal.getConnection();
    }
    
    
    public boolean salvar(Cliente cliente){
	// query para inserir um novo imóvel
	String query = "INSERT INTO cliente (nome, rg, cpf, dataNascimento, telefone, ocupacao) VALUES (?, ?, ?, ?, ?, ?)";
	PreparedStatement stmt = null;
	 

	try {
	    stmt = con.prepareStatement(query);
	    stmt.setString(1, cliente.getNome());
	    stmt.setString(2, cliente.getRg());
	    stmt.setString(3, cliente.getCpf());

	    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	    Date dataDaAquisicao = null;
	    try {
		dataDaAquisicao = formato.parse(cliente.getDataNascimento());
	    } catch (ParseException e) {
		e.printStackTrace();
	    }

	    stmt.setDate(4, new java.sql.Date(dataDaAquisicao.getTime()));
	    stmt.setString(5, cliente.getTelefone());
	    stmt.setString(6,  cliente.getOcupacao());
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

    public boolean editar(Cliente cliente){
	// query para inserir um novo imóvel
	String query = "UPDATE cliente SET nome = ?, rg = ?, cpf = ?, dataNascimento = ?, telefone = ?, ocupacao = ? WHERE id = ?";
	PreparedStatement stmt = null;

	try {
	    stmt.setString(1, cliente.getNome());
	    stmt.setString(2, cliente.getRg());
	    stmt.setString(3, cliente.getCpf());

	    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	    Date dataNascimento = null;
	    try {
		dataNascimento = formato.parse(cliente.getDataNascimento());
	    } catch (ParseException e) {
		e.printStackTrace();
	    }

	    stmt.setDate(4, new java.sql.Date(dataNascimento.getTime()));
	    stmt.setString(5, cliente.getTelefone());
	    stmt.setString(6,  cliente.getOcupacao());
	    stmt.setInt(7,  cliente.getId());
	    
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
    
    public List<Cliente> buscarTodos(){
	String query = "SELECT * FROM cliente";
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	List<Cliente> clientes = new ArrayList<>();
	
	try {
	    stmt = con.prepareStatement(query);
	    rs = stmt.executeQuery();

	    while (rs.next()){
		Cliente cliente = new Cliente();
		cliente.setNome(rs.getString("nome"));
		cliente.setRg(rs.getString("rg"));
		cliente.setCpf(rs.getString("cpf"));
		cliente.setDataNascimento(rs.getString("cidade"));
		cliente.setTelefone(rs.getString("telefone"));
		cliente.setOcupacao(rs.getString("ocupacao"));
	    }

	} catch (SQLException ex) {
	    System.out.println("Erro: "+ex);
	} finally {
	    Principal.closeConnection(con, stmt, rs);
	}

	return clientes;

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
