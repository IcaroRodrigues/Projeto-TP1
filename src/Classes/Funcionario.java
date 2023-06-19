/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Gabriel Santos Pereira
 */
class Funcionario extends Pessoa {
    //Declaração dos Atributos
    protected String    funcao;
    protected float     salario;
    protected String    senha;
    
    //Declaração dos Métodos Construtores
    //inicialização de todos os atributos com valores default
    public Funcionario() {} 
    
    //inicialização recebendo todos os argumentos de acordo com os atributos
    public Funcionario(int id, String nome, String RG, String CPF, String dataNascimento, String telefone, String funcao, float salario, String senha) {
        super(id, nome, RG, CPF, dataNascimento, telefone);
        this.funcao     = funcao;
        this.salario    = salario;
        this.senha      = senha;
    }
    
    
    //Declaração dos Métodos gets e sets
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
/* É preciso get e set de senha?
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }*/ 
    
    //Método para validar senha
    public boolean validarSenha(String CPF, String senha){
        return this.CPF.equals(CPF) && this.senha.equals(senha);
    }
    
    //Método para cálculo de sálario
    public float calculaSalario(float salarioBase, int quantidadeDeVendas, float comissao){
        float salario = 0; 
        return salario = (salarioBase + (quantidadeDeVendas * comissao));
    }
}