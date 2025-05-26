/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoaluguelcarro;

import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author User
 */

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Cliente {
    private int idCliente;
    private String nomeCompleto;
    private String cpf;
    private Date dataNascimento;
    private String telefone;
    private String email;
    private String cep;
    private String cnh;
    private String sexo;
    private String situacao;

    // Formato de data padronizado
    private static final SimpleDateFormat FORMATO_DATA = new SimpleDateFormat("dd/MM/yyyy");

    // Construtor
    public Cliente(int idCliente, String nomeCompleto, String cpf, String dataNascimento, String telefone, String email,
                   String cep, String cnh, String sexo, String situacao) {
        this.idCliente = idCliente;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dataNascimento = parseData(dataNascimento); // Convertendo string para Date
        this.telefone = telefone;
        this.email = email;
        this.cep = cep;
        this.cnh = cnh;
        this.sexo = sexo;
        this.situacao = situacao;
    }

    // Métodos auxiliares para conversão de data
    private Date parseData(String data) {
        try {
            return FORMATO_DATA.parse(data);
        } catch (ParseException e) {
            System.err.println("Erro ao converter data: " + data);
            return null;
        }
    }

    // Getters e Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = parseData(dataNascimento);
    }

    public String getDataNascimentoFormatada() {
        return (dataNascimento != null) ? FORMATO_DATA.format(dataNascimento) : null;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}

