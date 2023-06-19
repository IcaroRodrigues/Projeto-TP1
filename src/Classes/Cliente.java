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
    private String ocupação;
    
    //Declaração dos Métodos Construtores
    //inicialização de todos os atributos com valores default
    public Cliente() {} 

    // inicialização recebendo todos os argumentos de acordo com os atributos
    public Cliente(String ocupação, int id, String nome, String RG, String CPF, String dataNascimento, String telefone) {
        super(id, nome, RG, CPF, dataNascimento, telefone);
        this.ocupação = ocupação;
    }
    
    //Declaração dos Métodos gets e sets
    public String getOcupação() {
        return ocupação;
    }

    public void setOcupação(String ocupação) {
        this.ocupação = ocupação;
    }
}
