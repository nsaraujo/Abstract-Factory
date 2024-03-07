/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabricamotos;

/**
 *
 * @author 55649
 */
public class FabricaHonda implements IFabricaDeMotos {

    @Override
    public IMotoAte125cc cria_moto_125cc() {
        return new Biz("Branca", 16.000);
    }

    @Override
    public IMotoAte160cc cria_moto_160cc() {
        return new CG("Vermelha", 18.000);
    }

    
    
}
