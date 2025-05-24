/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoaluguelcarro;

/**
 *
 * @author User
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Aluguel {

    private int idAluguel;
    private int idCarro;
    private int idCliente;
    private String placaCarro;
    private String cpfCliente;
    private Date dataInicio;
    private Date dataFinal;
    private double valorTotal;
    private String status;
    private String situacao;
    private String formaPagamento;
    private String observacoes;
    private Date dataCriacao;

    public Aluguel(Connection conn, int idCarro, int idCliente, String placaCarro, String cpfCliente,
                   Date dataInicio, Date dataFinal, String status, String situacao,
                   String formaPagamento, String observacoes) {

        this.idCarro = idCarro;
        this.idCliente = idCliente;
        this.placaCarro = placaCarro;
        this.cpfCliente = cpfCliente;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.status = status;
        this.situacao = situacao;
        this.formaPagamento = formaPagamento;
        this.observacoes = observacoes;
        this.dataCriacao = new Date();

        double diaria = buscarDiaria(conn, idCarro);
        calcularValorTotal(diaria);
    }

    private double buscarDiaria(Connection conn, int idCarro) {
        double diaria = 0.0;
        String sql = "SELECT diaria FROM carro WHERE id_carro = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCarro);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                diaria = rs.getDouble("diaria");
            }
        } catch (SQLException e) {
        }

        return diaria;
    }

    private void calcularValorTotal(double diaria) {
        long diffMillis = dataFinal.getTime() - dataInicio.getTime();
        int dias = (int) (diffMillis / (1000 * 60 * 60 * 24));
        if (dias == 0) dias = 1;
        this.valorTotal = diaria * dias;
    }

    // Getters e Setters

    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
