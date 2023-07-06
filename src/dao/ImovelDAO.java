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
	String query = "SELECT id, bairro, valor, valorDaCompra, dataDaAquisicao FROM apartamento, casa, lote WHERE disponivel = true ORDER BY dataDaAquisicao";
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	List<Imovel> imoveis = new ArrayList<>();
	
	try {
	    stmt = con.prepareStatement(query);
	    rs = stmt.executeQuery();

	    while (rs.next()){
		Imovel imovel = new Imovel();
		stmt = con.prepareStatement(query);
		imovel.setId(rs.getInt("id"));
                imovel.setValorDaCompra(rs.getDouble("valor"));
		imovel.setBairro(rs.getString("endereco"));
                imovel.calcularVenda(rs.getDouble("venda"));
		imoveis.add(imovel);
	    }

	} catch (SQLException ex) {
	    System.out.println("Erro: "+ex);
	} finally {
	    Principal.closeConnection(con, stmt, rs);
	}

	return imoveis;

    }
}
