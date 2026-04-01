package org.alistabrasil.models;

import java.util.Date;

public class Certificado {

    private String idCertificado;
    private String tipoCertificado;
    private Date dataEmissao;
    private String codigoAutenticado;

    public Certificado(String idCertificado, String tipoCertificado, Date dataEmissao) {
        this.idCertificado = idCertificado;
        this.tipoCertificado = tipoCertificado;
        this.dataEmissao = dataEmissao;
    }

    public String getIdCertificado() {
        return idCertificado;
    }

    public String getTipoCertificado() {
        return tipoCertificado;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public String getCodigoAutenticado() {
        return codigoAutenticado;
    }

    public String toString(){

        return "Numero de certificado: " + 
        idCertificado + "\nTipo de certficado: " +
        tipoCertificado + "Data de Emissão: " +
        dataEmissao + "Código de autenticação: " + 
        codigoAutenticado;
        
    }  
}
