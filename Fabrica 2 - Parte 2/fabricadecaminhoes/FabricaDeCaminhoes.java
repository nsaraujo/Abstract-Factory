/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fabricadecaminhoes;

/**
 *
 * @author 55649
 */
public class FabricaDeCaminhoes {

    public static void main(String[] args) {
        
        IFabricaDeCaminhao mercedesBens = new FabricaMercedesBens();
        ICaminhao4x2 actros = mercedesBens.cria_caminhao_4x2();
        actros.exibir_info_caminhao4x2();
        
        ICaminhão6x4 atego = mercedesBens.cria_caCaminhão6x4();
        atego.exibir_info_caminhao6x2();
        
        
        
        IFabricaDeCaminhao volvo = new FabricaVolvo();
        ICaminhao4x2 fh = volvo.cria_caminhao_4x2();
        fh.exibir_info_caminhao4x2();
        
        ICaminhão6x4 nh = volvo.cria_caCaminhão6x4();
        nh.exibir_info_caminhao6x2();
        
        
        IFabricaDeCaminhao volkswagen = new FabricaVolkswagen();
        ICaminhao4x2 constellation = volkswagen.cria_caminhao_4x2();
        constellation.exibir_info_caminhao4x2();
        
        ICaminhão6x4 meteor = volkswagen.cria_caCaminhão6x4();
        meteor.exibir_info_caminhao6x2();
        
        
        
        
    }
}
