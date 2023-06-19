/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Gabriel Santos Pereira
 */
class Corretor extends Funcionario{
    //Declaração dos Atributos
    private String creci;
    
    //Declaração dos Métodos Construtores
    //inicialização de todos os atributos com valores default
    public Corretor(String creci) {}

    //inicialização recebendo todos os argumentos de acordo com os atributos
    public Corretor(int id, String nome, String RG, String CPF, String dataNascimento, String telefone, String funcao, float salario, String senha, String creci) {
        super(id, nome, RG, CPF, dataNascimento, telefone, funcao, salario, senha);
        this.creci = creci;
    }
    
    //Declaração dos Métodos gets e sets
    public String getCreci() {
        return creci;
    }

    public void setCreci(String creci) {
        this.creci = creci;
    }  
}