/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package Classes;

/**
* Classe que representa um cliente.
* Contém as informações básicas de identificação e contato de uma pessoa derivadas da classe Pessoa
 e a ocupação do cliente.
*/
public class Cliente extends Pessoa {
    // Declaração dos Atributos
    private String ocupacao;
    
    /** Construtor vazio da classe Cliente.*/
    public Cliente() {} 

    /** Construtor que inicializa todas as propriedades da classe Cliente.*/
    public Cliente(String nome, String rg, String cpf, String dataNascimento, String telefone, String ocupacao) {
        super(nome, rg, cpf, dataNascimento, telefone);
        this.ocupacao = ocupacao;
    }
    
    // Declaração dos Métodos gets e sets
    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }
}
