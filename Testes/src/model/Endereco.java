package model;
// Generated 03/01/2016 21:12:32 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Endereco generated by hbm2java
 */
public class Endereco  implements java.io.Serializable {


     private String cep;
     private String logradouro;
     private String nomeDaRua;
     private String bairro;
     private String cidade;
     private String estado;
     private String pais;
     private Set alunoses = new HashSet(0);

    public Endereco() {
    }

	
    public Endereco(String cep, String logradouro, String nomeDaRua, String bairro, String cidade, String estado, String pais) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.nomeDaRua = nomeDaRua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }
    public Endereco(String cep, String logradouro, String nomeDaRua, String bairro, String cidade, String estado, String pais, Set alunoses) {
       this.cep = cep;
       this.logradouro = logradouro;
       this.nomeDaRua = nomeDaRua;
       this.bairro = bairro;
       this.cidade = cidade;
       this.estado = estado;
       this.pais = pais;
       this.alunoses = alunoses;
    }
   
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getLogradouro() {
        return this.logradouro;
    }
    
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getNomeDaRua() {
        return this.nomeDaRua;
    }
    
    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Set getAlunoses() {
        return this.alunoses;
    }
    
    public void setAlunoses(Set alunoses) {
        this.alunoses = alunoses;
    }




}


