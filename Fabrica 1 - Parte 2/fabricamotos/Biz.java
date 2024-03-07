/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabricamotos;

/**
 *
 * @author 55649
 */
public class Biz implements IMotoAte125cc{
    private String cor;
    private double preco;

    public Biz(String cor, double preco) {
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
    public void exbir_info_125cc() {
        System.out.println("A cor da Biz é: " + cor);
        System.out.println("O preço da Biz é: " + preco);
        System.out.println("\n ---------------------------------");
    
    }
    
}
