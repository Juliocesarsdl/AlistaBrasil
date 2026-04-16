package org.alistabrasil.models;

import java.time.LocalDate;

public class Certificado {

    private String idCertificado;
    private String tipoCertificado;
    private LocalDate dataEmissao;

    public Certificado(String idCertificado, String tipoCertificado, LocalDate dataEmissao) {
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

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }
}
