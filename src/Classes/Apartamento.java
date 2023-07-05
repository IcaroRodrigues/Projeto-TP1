/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 * Classe que representa um apartamento.
 * Herda da classe Imovel.
 */
public class Apartamento extends Imovel{
    // Declaração dos Atributos
    private int numeroDoAndar;
    private int numeroDoApartamento;
    private int qntDeComodos;
    private int qntDePavimentos;
    private int idadeDoImovel;
    
    /** Construtor vazio da classe Apartamento.*/
    public Apartamento() {}

    /** Construtor que inicializa todas as propriedades da classe Apartamento.*/
    public Apartamento(int numeroDoAndar, int numeroDoApartamento, int qntDeComodos, int qntDePavimentos, int idadeDoImovel, String rua, String bairro, String cep, String cidade, double valorDaCompra, Date dataDaAquisicao, boolean disponivel) {
        super(rua, bairro, cep, cidade, valorDaCompra, dataDaAquisicao, disponivel);
        this.numeroDoAndar = numeroDoAndar;
        this.numeroDoApartamento = numeroDoApartamento;
        this.qntDeComodos = qntDeComodos;
        this.qntDePavimentos = qntDePavimentos;
        this.idadeDoImovel = idadeDoImovel;
    }

    public Apartamento(int numeroDoAndar, int numeroDoApartamento, int qntDeComodos, int qntDePavimentos, double valorCondominio, int idadeDoImovel, String rua, String bairro, String cep, String cidade, double valorDaCompra, Date dataDaAquisicao, boolean disponivel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /** Metodo que calcula o valor do aluguél sendo 1% do valor de aquisição do imóvel multiplicado 
	pela quandtidade de pavimentos*/
    public double calcularAluguel(int qntDePavimentos, double valorDaCompra){
        return (valorDaCompra * 0.01) * qntDePavimentos ; 
    }

    /** Metodo que calcula o valor de venda sendo o preço calculado em imóvel(120%do valor da compra) 
	mais 10% do valor da compra multiplicado pela quantidade de pavimentos*/
    @Override
    public double calcularVenda(double valorDaCompra){
        double preco = super.calcularVenda(valorDaCompra);
        return preco +  (this.qntDePavimentos * (valorDaCompra * 0.1));
    }
    
    // Declaração dos Métodos gets e sets
    public int getNumeroDoAndar() {
        return numeroDoAndar;
    }

    public void setNumeroDoAndar(int numeroDoAndar) {
        this.numeroDoAndar = numeroDoAndar;
    }

    public int getNumeroDoApartamento() {
        return numeroDoApartamento;
    }

    public void setNumeroDoApartamento(int numeroDoApartamento) {
        this.numeroDoApartamento = numeroDoApartamento;
    }

    public int getQntDeComodos() {
        return qntDeComodos;
    }

    public void setQntDeComodos(int qntDeComodos) {
        this.qntDeComodos = qntDeComodos;
    }

    public int getQntDePavimentos() {
        return qntDePavimentos;
    }

    public void setQntDePavimentos(int qntDePavimentos) {
        this.qntDePavimentos = qntDePavimentos;
    }

    public int getIdadeDoImovel() {
        return idadeDoImovel;
    }

    public void setIdadeDoImovel(int idadeDoImovel) {
        this.idadeDoImovel = idadeDoImovel;
    }
}
