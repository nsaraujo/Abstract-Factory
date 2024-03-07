/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabricadecaminhoes;

/**
 *
 * @author 55649
 */
public class FabricaMercedesBens implements IFabricaDeCaminhao{

    @Override
    public ICaminhao4x2 cria_caminhao_4x2() {
       return new Actros("Branco", 680.000);
    }

    @Override
    public ICaminhão6x4 cria_caCaminhão6x4() {
        return new Atego("Preto", 455.000);       
    }
     
}
