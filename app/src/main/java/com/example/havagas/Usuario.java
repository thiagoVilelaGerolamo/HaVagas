package com.example.havagas;

import androidx.annotation.NonNull;

public class Usuario {
    private String  nome;
    private String  email;
    private Boolean receberEmail;
    private String  tipoTelefone;
    private String  telefone;
    private String  celular;
    private String  sexo;
    private String  dataNascimento;
    private String  formacao;
    private String  fundamentalAnoFormatura;
    private String  medioAnoformatura;
    private String  graduacaoConclusao;
    private String  graduacaoInstituicao;
    private String  doutoradoConclusao;
    private String  doutoradoInstituicao;
    private String  doutoradoMonografia;
    private String  doutoradoOrientador;
    private String  vagasDeInteresse;

    public Usuario(String nome, String email, Boolean receberEmail, String tipoTelefone, String telefone, String celular, String sexo, String dataNascimento, String formacao, String fundamentalAnoFormatura, String medioAnoformatura, String graduacaoConclusao, String graduacaoInstituicao, String doutoradoConclusao, String doutoradoInstituicao, String doutoradoMonografia, String doutoradoOrientador, String vagasDeInteresse) {
        this.nome = nome;
        this.email = email;
        this.receberEmail = receberEmail;
        this.tipoTelefone = tipoTelefone;
        this.telefone = telefone;
        this.celular = celular;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.formacao = formacao;
        this.fundamentalAnoFormatura = fundamentalAnoFormatura;
        this.medioAnoformatura = medioAnoformatura;
        this.graduacaoConclusao = graduacaoConclusao;
        this.graduacaoInstituicao = graduacaoInstituicao;
        this.doutoradoConclusao = doutoradoConclusao;
        this.doutoradoInstituicao = doutoradoInstituicao;
        this.doutoradoMonografia = doutoradoMonografia;
        this.doutoradoOrientador = doutoradoOrientador;
        this.vagasDeInteresse = vagasDeInteresse;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getReceberEmail() {
        return receberEmail;
    }

    public void setReceberEmail(Boolean receberEmail) {
        this.receberEmail = receberEmail;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getFundamentalAnoFormatura() {
        return fundamentalAnoFormatura;
    }

    public void setFundamentalAnoFormatura(String fundamentalAnoFormatura) {
        this.fundamentalAnoFormatura = fundamentalAnoFormatura;
    }

    public String getMedioAnoformatura() {
        return medioAnoformatura;
    }

    public void setMedioAnoformatura(String medioAnoformatura) {
        this.medioAnoformatura = medioAnoformatura;
    }

    public String getGraduacaoConclusao() {
        return graduacaoConclusao;
    }

    public void setGraduacaoConclusao(String graduacaoConclusao) {
        this.graduacaoConclusao = graduacaoConclusao;
    }

    public String getGraduacaoInstituicao() {
        return graduacaoInstituicao;
    }

    public void setGraduacaoInstituicao(String graduacaoInstituicao) {
        this.graduacaoInstituicao = graduacaoInstituicao;
    }

    public String getDoutoradoConclusao() {
        return doutoradoConclusao;
    }

    public void setDoutoradoConclusao(String doutoradoConclusao) {
        this.doutoradoConclusao = doutoradoConclusao;
    }

    public String getDoutoradoInstituicao() {
        return doutoradoInstituicao;
    }

    public void setDoutoradoInstituicao(String doutoradoInstituicao) {
        this.doutoradoInstituicao = doutoradoInstituicao;
    }

    public String getDoutoradoMonografia() {
        return doutoradoMonografia;
    }

    public void setDoutoradoMonografia(String doutoradoMonografia) {
        this.doutoradoMonografia = doutoradoMonografia;
    }

    public String getDoutoradoOrientador() {
        return doutoradoOrientador;
    }

    public void setDoutoradoOrientador(String doutoradoOrientador) {
        this.doutoradoOrientador = doutoradoOrientador;
    }

    public String getVagasDeInteresse() {
        return vagasDeInteresse;
    }

    public void setVagasDeInteresse(String vagasDeInteresse) {
        this.vagasDeInteresse = vagasDeInteresse;
    }

    @NonNull
    @Override
    public String toString() {
        return "Usuario{" +
                "nome='"                         + nome                       + '\'' +
                ", email='"                      + email                      + '\'' +
                ", receberEmail="                + receberEmail +
                ", tipoTelefone='"               + tipoTelefone               + '\'' +
                ", telefone='"                   + telefone                   + '\'' +
                ", celular='"                    + celular                    + '\'' +
                ", sexo='"                       + sexo                       + '\'' +
                ", dataNascimento='"             + dataNascimento             + '\'' +
                ", formacao='"                   + formacao                   + '\'' +
                ", fundamentalAnoformatura='"    + fundamentalAnoFormatura    + '\'' +
                ", medioAnoformatura='"          + medioAnoformatura          + '\'' +
                ", graduacaoConclusao='"         + graduacaoConclusao         + '\'' +
                ", graduacaoInstituicao='"       + graduacaoInstituicao       + '\'' +
                ", doutoradoConclusao='"         + doutoradoConclusao         + '\'' +
                ", doutoradoInstituicao='"       + doutoradoInstituicao       + '\'' +
                ", doutoradoMonografia='"        + doutoradoMonografia        + '\'' +
                ", doutoradoOrientador='"        + doutoradoOrientador        + '\'' +
                ", vagasDeInteresse='"           + vagasDeInteresse           + '\'' +
                '}';
    }
}
