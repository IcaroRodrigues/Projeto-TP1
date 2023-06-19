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
public class Apartamento extends Imovel{
    private int numeroDoAndar;
    private int numeroDoApartamento;
    private int qntDeComodos;
    private int qntDePavimentos;
    private double valorCondominio;
    private int idadeDoImovel;
    private boolean alugado;
    private boolean vendido;

    public Apartamento() {
    }

    public Apartamento(int numeroDoAndar, int numeroDoApartamento, int qntDeComodos, int qntDePavimentos, double valorCondominio, int idadeDoImovel, boolean alugado, boolean vendido, int id, String rua, String bairro, String cep, String cidade, double valorDaCompra, double valorDaVenda, Date dataDaAquisicao) {
        super(id, rua, bairro, cep, cidade, valorDaCompra, dataDaAquisicao);
        this.numeroDoAndar = numeroDoAndar;
        this.numeroDoApartamento = numeroDoApartamento;
        this.qntDeComodos = qntDeComodos;
        this.qntDePavimentos = qntDePavimentos;
        this.valorCondominio = valorCondominio;
        this.idadeDoImovel = idadeDoImovel;
        this.alugado = alugado;
        this.vendido = vendido;
    }

    public double calcularAluguel(int qntDePavimentos, double valorDaCompra){
        return (valorDaCompra * 0.01) * qntDePavimentos ; 
    }
    
    @Override
    public double calcularVenda(double valorDaCompra){
        double preco = super.calcularVenda(valorDaCompra);
        return preco +  (this.qntDePavimentos * (valorDaCompra * 0.1));
    }
    
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

    public double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    public int getIdadeDoImovel() {
        return idadeDoImovel;
    }

    public void setIdadeDoImovel(int idadeDoImovel) {
        this.idadeDoImovel = idadeDoImovel;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
}
