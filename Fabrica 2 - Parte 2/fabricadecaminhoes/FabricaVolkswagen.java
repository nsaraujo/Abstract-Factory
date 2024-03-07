/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabricadecaminhoes;

/**
 *
 * @author 55649
 */
public class FabricaVolkswagen implements IFabricaDeCaminhao{

    @Override
    public ICaminhao4x2 cria_caminhao_4x2() {
        return new Constellation("Vermelho", 120000.000);
    }

    @Override
    public ICaminhão6x4 cria_caCaminhão6x4() {
        return new Meteor("Verde", 890000.000);
    }
}
