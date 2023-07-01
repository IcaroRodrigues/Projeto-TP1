/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 * Classe que representa um lote.
 * Herda da classe Imovel.
*/
public class Lote extends Imovel{
    // Declaração dos Atributos
    private int numeroDoLote;
    private double areaDoLote;
    private boolean vendido;

    /** Construtor vazio da classe Lote. */
    public Lote() {}
    
    /** Construtor que inicializa todas as propriedades da classe Lote.*/
    public Lote(int numeroDoLote, double areaDoLote, boolean vendido, int id, String rua, String bairro, String cep, String cidade, double valorDaCompra, Date dataDaAquisicao) {
        super(id, rua, bairro, cep, cidade, valorDaCompra, dataDaAquisicao);
        this.numeroDoLote = numeroDoLote;
        this.areaDoLote = areaDoLote;
        this.vendido = vendido;
    }

    // Declaração dos Métodos gets e sets
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
