/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package Classes;

/**
* Classe que representa um corretor.
* Contém as informações básicas de identificação e contato de uma pessoa derivadas da classe Pessoa, a demais informações de um funcionario derivadas da classe Funcionario e o creci do corretor.
* 
* @author Gabriel Santos Pereira
*/
public class Corretor extends Funcionario{
    // Declaração dos Atributos
    private String creci;
    
    // Declaração dos Métodos Construtores
    // Inicialização de todos os atributos com valores default
    public Corretor() {}

    // Inicialização recebendo todos os argumentos de acordo com os atributos
    public Corretor(int id, String nome, String rg, String cpf, String dataNascimento, String telefone, String funcao, float salario, String senha, boolean adm, String creci) {
        super(id, nome, rg, cpf, dataNascimento, telefone, "Corretor", salario, senha, false);
        this.creci = creci;
    }
    
    // Declaração dos Métodos gets e sets
    public String getCreci() {
        return creci;
    }

    public void setCreci(String creci) {
        this.creci = creci;
    }  
}
