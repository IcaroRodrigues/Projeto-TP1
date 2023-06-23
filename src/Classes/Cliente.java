/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Gabriel Santos Pereira
 */
class Cliente extends Pessoa {
    //Declaração dos Atributos
    private String ocupacao;
    
    //Declaração dos Métodos Construtores
    //inicialização de todos os atributos com valores default
    public Cliente() {} 

    // inicialização recebendo todos os argumentos de acordo com os atributos
    public Cliente(String ocupacao, int id, String nome, String rg, String cpf, String dataNascimento, String telefone) {
        super(id, nome, rg, cpf, dataNascimento, telefone);
        this.ocupacao = ocupacao;
    }
    
    //Declaração dos Métodos gets e sets
    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }
}
