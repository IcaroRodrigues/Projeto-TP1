/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
* Classe que representa um funcionario.
* Contém as informações básicas de identificação e contato de uma pessoa derivadas da classe Pessoa
  e a demais informações de um funcionario.
*/
public class Funcionario extends Pessoa {
    // Declaração dos Atributos
    protected String    funcao;
    protected float     salario;
    protected String    senha;
    protected boolean   adm;
    
    /** Construtor vazio da classe Funcionário. */
    public Funcionario() {} 
    
    /** Construtor que inicializa todas as propriedades da classe Funcionario.*/
    public Funcionario( String nome, String rg, String cpf, String dataNascimento, String telefone, String funcao, float salario, String senha, boolean adm) {
        super( nome, rg, cpf, dataNascimento, telefone);
        this.funcao     = funcao;
        this.salario    = salario;
        this.senha      = senha;
        this.adm        = adm;
    }
    
    // Declaração dos Métodos gets e sets
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
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    /** Método para validar senha */
    public boolean validarSenha(String cpf, String senha){
        return this.cpf.equals(cpf) && this.senha.equals(senha);
    }
    
    /** Método para cálculo de sálario */
    public float calculaSalario(float salarioBase, int quantidadeDeVendas, float comissao){
        float salario = 0; 
        return salario = (salarioBase + (quantidadeDeVendas * comissao));
    }
}
