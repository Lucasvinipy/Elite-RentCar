/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoaluguelcarro;

/**
 *
 * @author User
 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class Loja {
    private int idLoja;                  // PK automática
    private String nomeFantasia;        // texto
    private String cnpj;                // máscara: 00.000.000/0000-00
    private String cep;                 // máscara: 00000-000
    private String telefone;            // máscara: (00) 00000-0000
    private String email;               // texto
    private Date dataAbertura;          // java.util.Date
    private String tipoLoja;            // "Matriz" ou "Filial"
    private String responsavel;         // texto
    private String situacao;            // "Loja já cadastrada", "Loja não cadastrada"

    // Formato padrão de exibição da data
    private static final SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

    // Construtor completo sem ID (para novos cadastros)
    public Loja(String nomeFantasia, String cnpj, String cep, String telefone, String email,
                Date dataAbertura, String tipoLoja, String responsavel, String situacao) {
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.dataAbertura = dataAbertura;
        this.tipoLoja = tipoLoja;
        this.responsavel = responsavel;
        this.situacao = situacao;
    }

    // Construtor com ID (para carregamento do banco)
    public Loja(int idLoja, String nomeFantasia, String cnpj, String cep, String telefone, String email,
                Date dataAbertura, String tipoLoja, String responsavel, String situacao) {
        this.idLoja = idLoja;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.dataAbertura = dataAbertura;
        this.tipoLoja = tipoLoja;
        this.responsavel = responsavel;
        this.situacao = situacao;
    }

    // Getters e Setters
    public int getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(int idLoja) {
        this.idLoja = idLoja;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataAberturaFormatada() {
        if (dataAbertura != null) {
            return formatoData.format(dataAbertura);
        }
        return "";
    }

    public String getTipoLoja() {
        return tipoLoja;
    }

    public void setTipoLoja(String tipoLoja) {
        this.tipoLoja = tipoLoja;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    // Método utilitário
    public void exibirLoja() {
        System.out.println("ID: " + idLoja);
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("CEP: " + cep);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Data de Abertura: " + getDataAberturaFormatada());
        System.out.println("Tipo de Loja: " + tipoLoja);
        System.out.println("Responsável: " + responsavel);
        System.out.println("Situação: " + situacao);
    }
}
