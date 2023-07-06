/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Classes.Casa;
import Classes.Lote;
import Classes.Apartamento;
import Classes.Imovel;
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
 *
 * @author dyesi
 */
public class ImovelDAO {
    private Connection con = null;

    public ImovelDAO(){
	con = Principal.getConnection();
    }
    
    public List<Imovel> buscarDisponiveis(){
	String query = "SELECT * FROM apartamento";
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	List<Imovel> imoveis = new ArrayList<>();
	
	try {
	    stmt = con.prepareStatement(query);
	    rs = stmt.executeQuery();

	    while (rs.next()){
		Apartamento apartamento = new Apartamento();
		stmt = con.prepareStatement(query);
		apartamento.setRua(rs.getString("rua"));
		apartamento.setBairro(rs.getString("bairro"));
		apartamento.setCep(rs.getString("cep"));
		apartamento.setCidade(rs.getString("cidade"));
		apartamento.setValorDaCompra(rs.getDouble("valorDaCompra"));
		apartamento.setDataDaAquisicao(rs.getDate("dataDaAquisicao"));
		apartamento.setDisponivel(rs.getBoolean("disponivel"));
		apartamento.setNumeroDoAndar(rs.getInt("numeroDoAndar"));
		apartamento.setNumeroDoApartamento(rs.getInt("numeroDoApartamento"));
		apartamento.setQntDeComodos(rs.getInt("qntDeComodos"));
		apartamento.setQntDePavimentos(rs.getInt("qntDePavimentos"));
		apartamento.setIdadeDoImovel(rs.getInt("idadeDoImovel"));
		imoveis.add(apartamento);
	    }

	} catch (SQLException ex) {
	    System.out.println("Erro: "+ex);
	} finally {
	    Principal.closeConnection(con, stmt, rs);
	}

	return imoveis;

    }
}
