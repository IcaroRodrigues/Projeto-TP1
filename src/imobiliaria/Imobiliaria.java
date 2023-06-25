/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imobiliaria;

import java.sql.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
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
        String username = "usuario";
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
    }
    
}
