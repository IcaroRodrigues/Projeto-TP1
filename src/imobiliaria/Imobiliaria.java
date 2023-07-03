/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imobiliaria;

import java.sql.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;
/**
 *
 * @author dyesi
 */
public class Imobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        String url = "jdbc:mysql://localhost:3306/Imobiliaria";
        String username = "root";
        String password = "";

        try {
            Connection connection = (Connection) DriverManager.getConnection(url, "root", "");
            // Agora você possui uma conexão com o banco de dados
            System.out.println("Conexão bem-sucedida!");
            
            // Use a conexão para executar consultas, atualizações, etc.
            
            // Não se esqueça de fechar a conexão quando não precisar mais dela
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


	try {
	    Connection connection = (Connection) DriverManager.getConnection(url, "root", "");
	    System.out.println("Conexão bem-sucedida!");

	    // Consulta SQL para buscar o imóvel com id igual a 1
	    String query = "SELECT * FROM Imovel WHERE id = 0";

	    Statement statement = connection.createStatement();
	    ResultSet resultSet = statement.executeQuery(query);

	    /* Verifica se há resultados e imprime os dados do imóvel
	    if (resultSet.next()) {
		int id = resultSet.getInt("id");
		String rua = resultSet.getString("rua");
		String bairro = resultSet.getString("bairro");
		String cep = resultSet.getString("cep");
		String cidade = resultSet.getString("cidade");
		double valorDaCompra = resultSet.getDouble("valorDaCompra");
		Date dataDaAquisicao = resultSet.getDate("dataDaAquisicao");

		System.out.println("Imóvel encontrado:");
		System.out.println("ID: " + id);
		System.out.println("Rua: " + rua);
		System.out.println("Bairro: " + bairro);
		System.out.println("CEP: " + cep);
		System.out.println("Cidade: " + cidade);
		System.out.println("Valor da Compra: " + valorDaCompra);
		System.out.println("Data da Aquisição: " + dataDaAquisicao);
	    } else {
		System.out.println("Imóvel não encontrado.");
	    }
	    */
	    connection.close();
	} catch (SQLException e) {
	    e.printStackTrace();
	}
    }
    
}
