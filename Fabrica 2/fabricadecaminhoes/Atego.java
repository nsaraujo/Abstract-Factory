/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabricadecaminhoes;

/**
 *
 * @author 55649
 */
public class Atego implements ICaminhão6x4{
    private String cor;
    private double preco;

    public Atego(String cor, double preco) {
        this.cor = cor;
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    

    @Override
    public void exibir_info_caminhao6x2() {
        System.out.println("A cor do Atego é: " + cor);
        System.out.println("O preço do Atego é: R$ " + preco);
        System.out.println("----------------------------------------------------------------------");
    
    }
    
}
