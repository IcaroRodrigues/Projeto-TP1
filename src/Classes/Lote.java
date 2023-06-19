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
public class Lote extends Imovel{
    private int numeroDoLote;
    private double areaDoLote;
    private boolean vendido;

    public Lote() {
    }

    public Lote(int numeroDoLote, double areaDoLote, boolean vendido, int id, String rua, String bairro, String cep, String cidade, double valorDaCompra, double valorDaVenda, Date dataDaAquisicao) {
        super(id, rua, bairro, cep, cidade, valorDaCompra, dataDaAquisicao);
        this.numeroDoLote = numeroDoLote;
        this.areaDoLote = areaDoLote;
        this.vendido = vendido;
    }
    
    public int getNumeroDoLote() {
        return numeroDoLote;
    }

    public void setNumeroDoLote(int numeroDoLote) {
        this.numeroDoLote = numeroDoLote;
    }

    public double getAreaDoLote() {
        return areaDoLote;
    }

    public void setAreaDoLote(double areaDoLote) {
        this.areaDoLote = areaDoLote;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
}
