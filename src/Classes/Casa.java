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
public class Casa extends Imovel{
    private double tamanhoDoLote;
    private double areaConstruida;
    private int numeroDaCasa;
    private int qntDeComodos;
    private int qntDePavimentos;
    private int idadeDoImovel;
    private boolean alugado;
    private boolean vendido;

    public Casa() {
    }

    public Casa(double tamanhoDoLote, double areaConstruida, int numeroDaCasa, int qntDeComodos, int qntDePavimentos, int idadeDoImovel, boolean alugado, boolean vendido, int id, String rua, String bairro, String cep, String cidade, double valorDaCompra, double valorDaVenda, Date dataDaAquisicao) {
        super(id, rua, bairro, cep, cidade, valorDaCompra, dataDaAquisicao);
        this.tamanhoDoLote = tamanhoDoLote;
        this.areaConstruida = areaConstruida;
        this.numeroDaCasa = numeroDaCasa;
        this.qntDeComodos = qntDeComodos;
        this.qntDePavimentos = qntDePavimentos;
        this.idadeDoImovel = idadeDoImovel;
        this.alugado = alugado;
        this.vendido = vendido;
    }
    
    public double calcularAluguel(int qntDePavimentos, int qntDeComodos, double valorDaCompra){
        if (qntDeComodos <=5) {
            return (valorDaCompra * 0.01)*qntDePavimentos ;
        } else {
            return (valorDaCompra * 0.01)* qntDePavimentos * (qntDeComodos - 4);
        }
    }
    
    @Override
    public double calcularVenda(double valorDaCompra){
        double preco = super.calcularVenda(valorDaCompra);
        if (this.qntDeComodos <=5) {
            return preco +  (this.qntDePavimentos * (valorDaCompra * 0.1));
        } else {
            return preco +  (this.qntDePavimentos * (valorDaCompra * 0.1) *  (qntDeComodos - 4));
        }
    }
    
    
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
