/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabricadecaminhoes;

/**
 *
 * @author 55649
 */
public class FabricaVolvo implements IFabricaDeCaminhao {

    @Override
    public ICaminhao4x2 cria_caminhao_4x2() {
        return new FH("Azul", 520000.000);
    }

    @Override
    public ICaminhão6x4 cria_caCaminhão6x4() {
        return new NH("Laranja", 150000.000);
    }
    
}
