package model;
// Generated 03/01/2016 21:12:32 by Hibernate Tools 4.3.1



/**
 * DespesaspagasAcademia generated by hbm2java
 */
public class DespesaspagasAcademia  implements java.io.Serializable {


     private DespesaspagasAcademiaId id;
     private Despesas despesas;
     private boolean parcelamento;
     private Integer parcelasTotais;
     private Integer parcelaAtual;
     private Double valorPago;

    public DespesaspagasAcademia() {
    }

	
    public DespesaspagasAcademia(DespesaspagasAcademiaId id, Despesas despesas, boolean parcelamento) {
        this.id = id;
        this.despesas = despesas;
        this.parcelamento = parcelamento;
    }
    public DespesaspagasAcademia(DespesaspagasAcademiaId id, Despesas despesas, boolean parcelamento, Integer parcelasTotais, Integer parcelaAtual, Double valorPago) {
       this.id = id;
       this.despesas = despesas;
       this.parcelamento = parcelamento;
       this.parcelasTotais = parcelasTotais;
       this.parcelaAtual = parcelaAtual;
       this.valorPago = valorPago;
    }
   
    public DespesaspagasAcademiaId getId() {
        return this.id;
    }
    
    public void setId(DespesaspagasAcademiaId id) {
        this.id = id;
    }
    public Despesas getDespesas() {
        return this.despesas;
    }
    
    public void setDespesas(Despesas despesas) {
        this.despesas = despesas;
    }
    public boolean isParcelamento() {
        return this.parcelamento;
    }
    
    public void setParcelamento(boolean parcelamento) {
        this.parcelamento = parcelamento;
    }
    public Integer getParcelasTotais() {
        return this.parcelasTotais;
    }
    
    public void setParcelasTotais(Integer parcelasTotais) {
        this.parcelasTotais = parcelasTotais;
    }
    public Integer getParcelaAtual() {
        return this.parcelaAtual;
    }
    
    public void setParcelaAtual(Integer parcelaAtual) {
        this.parcelaAtual = parcelaAtual;
    }
    public Double getValorPago() {
        return this.valorPago;
    }
    
    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }




}

