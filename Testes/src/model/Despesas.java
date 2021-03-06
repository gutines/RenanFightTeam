package model;
// Generated 03/01/2016 21:12:32 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Despesas generated by hbm2java
 */
public class Despesas  implements java.io.Serializable {


     private Integer idDespesa;
     private String descricaoDespesa;
     private boolean parcelamento;
     private Integer parcelaTotais;
     private Integer parcelaAtual;
     private int diaVencimento;
     private Date dataPegamento;
     private Set despesaspagasAcademias = new HashSet(0);

    public Despesas() {
    }

	
    public Despesas(String descricaoDespesa, boolean parcelamento, int diaVencimento) {
        this.descricaoDespesa = descricaoDespesa;
        this.parcelamento = parcelamento;
        this.diaVencimento = diaVencimento;
    }
    public Despesas(String descricaoDespesa, boolean parcelamento, Integer parcelaTotais, Integer parcelaAtual, int diaVencimento, Date dataPegamento, Set despesaspagasAcademias) {
       this.descricaoDespesa = descricaoDespesa;
       this.parcelamento = parcelamento;
       this.parcelaTotais = parcelaTotais;
       this.parcelaAtual = parcelaAtual;
       this.diaVencimento = diaVencimento;
       this.dataPegamento = dataPegamento;
       this.despesaspagasAcademias = despesaspagasAcademias;
    }
   
    public Integer getIdDespesa() {
        return this.idDespesa;
    }
    
    public void setIdDespesa(Integer idDespesa) {
        this.idDespesa = idDespesa;
    }
    public String getDescricaoDespesa() {
        return this.descricaoDespesa;
    }
    
    public void setDescricaoDespesa(String descricaoDespesa) {
        this.descricaoDespesa = descricaoDespesa;
    }
    public boolean isParcelamento() {
        return this.parcelamento;
    }
    
    public void setParcelamento(boolean parcelamento) {
        this.parcelamento = parcelamento;
    }
    public Integer getParcelaTotais() {
        return this.parcelaTotais;
    }
    
    public void setParcelaTotais(Integer parcelaTotais) {
        this.parcelaTotais = parcelaTotais;
    }
    public Integer getParcelaAtual() {
        return this.parcelaAtual;
    }
    
    public void setParcelaAtual(Integer parcelaAtual) {
        this.parcelaAtual = parcelaAtual;
    }
    public int getDiaVencimento() {
        return this.diaVencimento;
    }
    
    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }
    public Date getDataPegamento() {
        return this.dataPegamento;
    }
    
    public void setDataPegamento(Date dataPegamento) {
        this.dataPegamento = dataPegamento;
    }
    public Set getDespesaspagasAcademias() {
        return this.despesaspagasAcademias;
    }
    
    public void setDespesaspagasAcademias(Set despesaspagasAcademias) {
        this.despesaspagasAcademias = despesaspagasAcademias;
    }




}


