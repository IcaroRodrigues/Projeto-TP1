/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author dyesi
 */
public abstract class Imovel {
    protected int id;
    protected String rua;
    protected String bairro;
    protected String cep;
    protected String cidade;
    protected double valorDaCompra;
    protected Date dataDaAquisicao;

    public Imovel() {
    }

    public Imovel(int id, String rua, String bairro, String cep, String cidade, double valorDaCompra, Date dataDaAquisicao) {
        this.id = id;
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.valorDaCompra = valorDaCompra;
        this.dataDaAquisicao = dataDaAquisicao;
    }
    
    public double calcularVenda(double valorDaCompra){
        return (valorDaCompra * 0.2) +  valorDaCompra;
    }
    
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
