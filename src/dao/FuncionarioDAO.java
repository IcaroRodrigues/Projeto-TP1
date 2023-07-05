/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Classes.Funcionario;
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
 * CRUD DE FUNCIONARIO
 * @author dyesi
 */
public class FuncionarioDAO {
    private Connection con = null;

    public FuncionarioDAO(){
	con = Principal.getConnection();
    }

    public boolean salvar(Funcionario funcionario){
	// query para inserir um novo imóvel
	String query = "INSERT INTO funcionario (nome, rg, cpf, dataNascimento, telefone, salario, adm) VALUES (?, ?, ?, ?, ?, ?, ?)";
	PreparedStatement stmt = null;
	 
	try {
	    stmt = con.prepareStatement(query);
	    stmt.setString(1, funcionario.getNome());
	    stmt.setString(2, funcionario.getRg());
	    stmt.setString(3, funcionario.getCpf());

	    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	    Date dataNascimento = null;
	    try {
		dataNascimento = formato.parse(funcionario.getDataNascimento());
	    } catch (ParseException e) {
		e.printStackTrace();
	    }

	    stmt.setDate(4, new java.sql.Date(dataNascimento.getTime()));
	    stmt.setString(5, funcionario.getTelefone());
	    stmt.setFloat(6,  funcionario.getSalario());
	    stmt.setBoolean(7,  funcionario.isAdm());
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

    public boolean editar(Funcionario funcionario){
	// query para inserir um novo imóvel
	String query = "UPDATE funcionario SET nome = ?, rg = ?, cpf = ?, dataNascimento = ?, telefone = ?, salario = ?, adm = ? WHERE id = ?";
	PreparedStatement stmt = null;

	try {
	    stmt.setString(1, funcionario.getNome());
	    stmt.setString(2, funcionario.getRg());
	    stmt.setString(3, funcionario.getCpf());

	    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	    Date dataNascimento = null;
	    try {
		dataNascimento = formato.parse(funcionario.getDataNascimento());
	    } catch (ParseException e) {
		e.printStackTrace();
	    }

	    stmt.setDate(4, new java.sql.Date(dataNascimento.getTime()));
	    stmt.setString(5, funcionario.getTelefone());
	    stmt.setFloat(6,  funcionario.getSalario());
	    stmt.setBoolean(7,  funcionario.isAdm());
	    stmt.setInt(8,  funcionario.getId());
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
    
    public List<Funcionario> buscarTodos(){
	String query = "SELECT * FROM funcionario";
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	List<Funcionario> funcionarios = new ArrayList<>();
	
	try {
	    stmt = con.prepareStatement(query);
	    rs = stmt.executeQuery();

	    while (rs.next()){
		Funcionario funcionario = new Funcionario();

		funcionario.setNome(rs.getString("nome"));
		funcionario.setRg(rs.getString("rg"));
		funcionario.setCpf(rs.getString("cpf"));
		funcionario.setDataNascimento(rs.getString("dataNascimento"));
		funcionario.setTelefone(rs.getString("telefone"));
		funcionario.setSalario(rs.getFloat("salario"));
		funcionario.setAdm(rs.getBoolean("adm"));
	    }

	} catch (SQLException ex) {
	    System.out.println("Erro: "+ex);
	} finally {
	    Principal.closeConnection(con, stmt, rs);
	}

	return funcionarios;

    }

    public boolean excluir(Funcionario funcionario){
	// query para inserir um novo imóvel
	String query = "DELETE * FROM funcionario WHERE id = ?";
	PreparedStatement stmt = null;

	try {
	    stmt.setInt(1, funcionario.getId());
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
