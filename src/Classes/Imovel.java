/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 * Classe que representa um imóvel.
 */
public class Imovel {
    // Declaração dos Atributos
    protected int id;
    protected String rua;
    protected String bairro;
    protected String cep;
    protected String cidade;
    protected double valorDaCompra;
    protected Date dataDaAquisicao;
    
    /** Construtor vazio da classe Imovel. */
    public Imovel() {}

    /** Construtor que inicializa todas as propriedades da classe Apartamento. */
    public Imovel( String rua, String bairro, String cep, String cidade, double valorDaCompra, Date dataDaAquisicao) {
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.valorDaCompra = valorDaCompra;
        this.dataDaAquisicao = dataDaAquisicao;
    }
    
    /** Metodo que calcula o valor de venda sendo 120%do valor da aquisição.*/
    public double calcularVenda(double valorDaCompra){
        return (valorDaCompra * 0.2) +  valorDaCompra;
    }
    
    // Declaração dos Métodos gets e sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }

    public Date getDataDaAquisicao() {
        return dataDaAquisicao;
    }

    public void setDataDaAquisicao(Date dataDaAquisicao) {
        this.dataDaAquisicao = dataDaAquisicao;
    }
    
}
