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
public class Casa extends Imovel{
    // Declaração dos Atributos
    private double tamanhoDoLote;
    private double areaConstruida;
    private int numeroDaCasa;
    private int qntDeComodos;
    private int qntDePavimentos;
    private int idadeDoImovel;
    private boolean aluga;
    private boolean vende;
    private boolean disponivel;

    /** Construtor vazio da classe Casa.*/
    public Casa() {}

    /** Construtor que inicializa todas as propriedades da classe Casa.*/
    public Casa(double tamanhoDoLote, double areaConstruida, int numeroDaCasa, int qntDeComodos, int qntDePavimentos, int idadeDoImovel, boolean aluga, boolean vende, boolean disponivel, String rua, String bairro, String cep, String cidade, double valorDaCompra, Date dataDaAquisicao) {
        super(rua, bairro, cep, cidade, valorDaCompra, dataDaAquisicao);
        this.tamanhoDoLote = tamanhoDoLote;
        this.areaConstruida = areaConstruida;
        this.numeroDaCasa = numeroDaCasa;
        this.qntDeComodos = qntDeComodos;
        this.qntDePavimentos = qntDePavimentos;
        this.idadeDoImovel = idadeDoImovel;
        this.aluga = aluga;
        this.vende = vende;
	this.disponivel = disponivel;
    }
    
    /** Metodo que calcula o valor do aluguél.
    *	Se a quantidade de cômodos excede 5 o valor do aluguél é 1% do valor da aquisição 
	multiplicado pela quantidade de pavimentos e pela quandidade de cômodos que excedem 5.
    *	Se a quantidade de cômodos for igual ou menor que 5, então o valor do aluguel é 1% do
	valor de compra multiplicado pela quantidade de pavimentos.
    */
    public double calcularAluguel(int qntDePavimentos, int qntDeComodos, double valorDaCompra){
        if (qntDeComodos <=5) {
            return (valorDaCompra * 0.01)*qntDePavimentos ;
        } else {
            return (valorDaCompra * 0.01)* qntDePavimentos * (qntDeComodos - 4);
        }
    }
    
    /** Metodo que calcula o valor de venda da casa.
    *	Se a quantidade de cômodos excede 5 o valor da venda é preço calculado 
	em imóvel(120%do valor da compra) mais 10% do valor da aquisição multiplicado
	pela quantidade de pavimentos e pela quandidade de cômodos que excedem 5.
    *	Se a quantidade de cômodos for igual ou menor que 5, então o valor da venda é
	o preço calculado em imóvel(120%do valor da compra) mais 10% do
	valor da aquisição multiplicado pela quandtidade de pavimentos.
    */
    @Override
    public double calcularVenda(double valorDaCompra){
        double preco = super.calcularVenda(valorDaCompra);
        if (this.qntDeComodos <=5) {
            return preco +  (this.qntDePavimentos * (valorDaCompra * 0.1));
        } else {
            return preco +  (this.qntDePavimentos * (valorDaCompra * 0.1) *  (qntDeComodos - 4));
        }
    }
    
    // Declaração dos Métodos gets e sets
    public double getTamanhoDoLote() {
        return tamanhoDoLote;
    }

    public int getIdadeDoImovel() {
        return idadeDoImovel;
    }

    public void setIdadeDoImovel(int idadeDoImovel) {
        this.idadeDoImovel = idadeDoImovel;
    }

    public void setTamanhoDoLote(double tamanhoDoLote) {
        this.tamanhoDoLote = tamanhoDoLote;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public int getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(int numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
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

    public boolean isAluga() {
	return aluga;
    }

    public void setAluga(boolean aluga) {
	this.aluga = aluga;
    }

    public boolean isVende() {
	return vende;
    }

    public void setVende(boolean vende) {
	this.vende = vende;
    }

    public boolean isDisponivel() {
	return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
	this.disponivel = disponivel;
    }
}
