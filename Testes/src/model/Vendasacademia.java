package model;
// Generated 03/01/2016 21:12:32 by Hibernate Tools 4.3.1



/**
 * Vendasacademia generated by hbm2java
 */
public class Vendasacademia  implements java.io.Serializable {


     private VendasacademiaId id;
     private Produtos produtos;
     private Integer quantidade;
     private Double valorVenda;

    public Vendasacademia() {
    }

	
    public Vendasacademia(VendasacademiaId id, Produtos produtos) {
        this.id = id;
        this.produtos = produtos;
    }
    public Vendasacademia(VendasacademiaId id, Produtos produtos, Integer quantidade, Double valorVenda) {
       this.id = id;
       this.produtos = produtos;
       this.quantidade = quantidade;
       this.valorVenda = valorVenda;
    }
   
    public VendasacademiaId getId() {
        return this.id;
    }
    
    public void setId(VendasacademiaId id) {
        this.id = id;
    }
    public Produtos getProdutos() {
        return this.produtos;
    }
    
    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }
    public Integer getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Double getValorVenda() {
        return this.valorVenda;
    }
    
    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }




}

