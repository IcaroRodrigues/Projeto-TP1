/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author icaro
 */
public class Transacao {
    private Imovel imovel;
    private Cliente cliente;
    private Corretor corretor;
    private String tipoDeTransacao;

    private Date dataDaOperacao;

    public Transacao() {};
    
    public Transacao(Imovel imovel, Cliente cliente, Corretor corretor, String tipoDeTransacao, Date dataDaOperacao) {
        this.imovel = imovel;
        this.cliente = cliente;
        this.corretor = corretor;
        this.tipoDeTransacao = tipoDeTransacao;
        this.dataDaOperacao = dataDaOperacao;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public String getTipoDeTransacao() {
        return tipoDeTransacao;
    }

    public void setTipoDeTransacao(String tipoDeTransacao) {
        this.tipoDeTransacao = tipoDeTransacao;
    }

    public Date getDataDaOperacao() {
        return dataDaOperacao;
    }

    public void setDataDaOperacao(Date dataDaOperacao) {
        this.dataDaOperacao = dataDaOperacao;
    }    
}
