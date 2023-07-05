/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package dao;

import Classes.Imovel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dyesi
 */
public class ImovelDAOTest {
    
    public ImovelDAOTest() {
    }

    @Test
    public void inserir() {
	
    }
    
    public void listar(){
	ImovelDAO dao = new ImovelDAO();

	for (Imovel c: dao.buscarTodos()) {
	    System.out.println("data"+ c.getDataDaAquisicao());
	}
    }
    
}
