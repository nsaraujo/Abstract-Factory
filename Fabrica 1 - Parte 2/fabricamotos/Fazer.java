/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabricamotos;

/**
 *
 * @author 55649
 */
public class Fazer implements IMotoAte160cc {
    private String cor;
    private double preco;

    public Fazer(String cor, double preco) {
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
    public void exibir_info_160cc() {
        System.out.println("A cor da Fazer é: " + cor);
        System.out.println("O preço da Fazer é: " + preco);
        System.out.println("\n ---------------------------------");
    }
    
}
