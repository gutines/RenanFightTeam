package model;
// Generated 03/01/2016 21:12:32 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Usuarios 
 */
public class Usuarios  implements java.io.Serializable {


     private String idUsuario;
     private String senha;
     private Date dataDeInclusao;

    public Usuarios() {
    }

    public Usuarios(String idUsuario, String senha, Date dataDeInclusao) {
       this.idUsuario = idUsuario;
       this.senha = senha;
       this.dataDeInclusao = dataDeInclusao;
    }
   
    public String getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Date getDataDeInclusao() {
        return this.dataDeInclusao;
    }
    
    public void setDataDeInclusao(Date dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }




}


