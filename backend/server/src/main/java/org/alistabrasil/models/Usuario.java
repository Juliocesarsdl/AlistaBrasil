package org.alistabrasil.models;


public class Usuario {

    
    private String cpf;
    private String nome;
    private String dataDeNascimento;
    private String email;
    private String senha;
    private String telefone;
    private String endereco;

    public Usuario() {

    }

    public Usuario(String cpf, String nome, String dataDeNascimento, String email, String senha, String telefone, String endereco) {
        this.cpf = cpf;
        this.nome = nome; 
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Usuario(String cpf, String senha){
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    } 
}
