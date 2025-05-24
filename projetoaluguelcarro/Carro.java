/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoaluguelcarro;

/**
 *
 * @author User
 */

/**
 * Classe que representa um Carro disponível para aluguel.
 */
public class Carro {

    // Atributos principais do carro
    private int id;
    private String modelo;
    private String marca;
    private String placa;
    private int ano;
    private String cor;
    private String tipoCombustivel;
    private double quilometragem;
    private double precoDiaria;
    private boolean disponivel;
    private int idLoja; // ID da loja onde o carro está localizado

    // Construtor padrão
    public Carro() {}

    // Construtor completo
    public Carro(int id, String modelo, String marca, String placa, int ano, String cor, 
                 String tipoCombustivel, double quilometragem, double precoDiaria, 
                 boolean disponivel, int idLoja) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
        this.quilometragem = quilometragem;
        this.precoDiaria = precoDiaria;
        this.disponivel = disponivel;
        this.idLoja = idLoja;
    }

    // Getters e Setters para todos os atributos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(int idLoja) {
        this.idLoja = idLoja;
    }

    // Método auxiliar para exibir status do carro
    public String getStatus() {
        return disponivel ? "Disponível" : "Alugado";
    }
}
