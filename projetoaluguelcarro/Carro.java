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
    private int idCarro;            // PK automática
    private String modelo;          // texto
    private String marca;           // texto
    private String placa;           // máscara: AAA-0A00
    private double diaria;          // valor monetário
    private String ano;             // limitado a 4 caracteres
    private String cor;             // texto
    private String combustivel;     // 1 - Gasolina, 2 - Álcool, 3 - Diesel, 4 - Flex
    private int quilometragem;      // máscara de milhar (formatação futura)
    private int idLoja;             // FK de loja
    private String situacao;        // "Carro já cadastrado", "Carro não cadastrado"

    // Construtor sem ID (para cadastro novo)
    public Carro(String modelo, String marca, String placa, double diaria, String ano,
                 String cor, String combustivel, int quilometragem, int idLoja, String situacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.diaria = diaria;
        this.ano = ano;
        this.cor = cor;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.idLoja = idLoja;
        this.situacao = situacao;
    }

    // Construtor com ID (para carregar do banco)
    public Carro(int idCarro, String modelo, String marca, String placa, double diaria, String ano,
                 String cor, String combustivel, int quilometragem, int idLoja, String situacao) {
        this.idCarro = idCarro;
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.diaria = diaria;
        this.ano = ano;
        this.cor = cor;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.idLoja = idLoja;
        this.situacao = situacao;
    }

    // Getters e Setters
    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
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

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        if (ano.length() <= 4) {
            this.ano = ano;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(int idLoja) {
        this.idLoja = idLoja;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    // Método utilitário para exibir os dados
    public void exibirCarro() {
        System.out.println("ID: " + idCarro);
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Placa: " + placa);
        System.out.println("Diária: R$ " + diaria);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Combustível: " + combustivel);
        System.out.println("Quilometragem: " + String.format("%,d km", quilometragem));
        System.out.println("ID Loja: " + idLoja);
        System.out.println("Situação: " + situacao);
    }
}
