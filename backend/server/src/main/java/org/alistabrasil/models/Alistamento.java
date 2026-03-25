package org.alistabrasil.models;
import org.alistabrasil.classeenum.StatusAlistamento;

public class Alistamento {

    private String idAlistamento;
    private String dataAlistamento;
    private StatusAlistamento status;
    private String observacoes;
    private Usuario usuario;
    
    
    public Alistamento(String idAlistamento, String dataAlistamento, Usuario usuario) {
        this.idAlistamento = idAlistamento;
        this.dataAlistamento = dataAlistamento;
        this.usuario = usuario;
    }

    public String getIdAlistamento() {
        return idAlistamento;
    }

    public void setIdAlistamento(String idAlistamento) {
        this.idAlistamento = idAlistamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDataAlistamento() {
        return dataAlistamento;
    }
    public void setDataAlistamento(String dataAlistamento) {
        this.dataAlistamento = dataAlistamento;
    }
    public StatusAlistamento getStatus() {
        return status;
    }
    public void setStatus(StatusAlistamento status) {
        this.status = status;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    } 


    public String toString(Usuario user){
        
        return "Nome: " + user.getNome() +
                "\nCPF: " + user.getCpf() + 
                "\nE-mail: " + user.getEmail() + 
                "\nID: " + idAlistamento + 
                "\nData de alistamento: " + dataAlistamento + 
                "\nStatus: " + status;
                
    }
}
