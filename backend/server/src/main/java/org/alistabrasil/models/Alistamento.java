package org.alistabrasil.models;


import java.time.LocalDate;

import org.alistabrasil.classeenum.StatusAlistamento;
import org.springframework.beans.factory.annotation.Autowired;

public class Alistamento {

    private String idAlistamento;
    private LocalDate dataAlistamento;
    private StatusAlistamento status;
    private String observacoes;
    
    @Autowired
    private Usuario usuario;
    
    public Alistamento(String idAlistamento, LocalDate dataAlistamento, StatusAlistamento status, Usuario usuario) {
        this.idAlistamento = idAlistamento;
        this.dataAlistamento = dataAlistamento;
        this.status = status;
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

    public LocalDate getDataAlistamento() {
        return dataAlistamento;
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
}
