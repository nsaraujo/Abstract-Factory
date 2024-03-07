/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fabricamotos;

/**
 *
 * @author 55649
 */
public class FabricaMotos {

    public static void main(String[] args) {
        IFabricaDeMotos honda = new FabricaHonda();
        
        IMotoAte125cc Biz = honda.cria_moto_125cc();
        Biz.exbir_info_125cc();
        
        IMotoAte160cc CG = honda.cria_moto_160cc();
        CG.exibir_info_160cc();
        
        IMotoAte125cc Pop = ((FabricaHonda) honda).criAte125cc();
        Pop.exbir_info_125cc();
     
        
        IFabricaDeMotos yamaha = new FabricaYamaha();
        
        IMotoAte125cc Crypton = yamaha.cria_moto_125cc();
        Crypton.exbir_info_125cc();
        
        IMotoAte160cc Factor = yamaha.cria_moto_160cc();
        Factor.exibir_info_160cc();
        
        IMotoAte160cc Fazer = ((FabricaYamaha) yamaha).criAte160cc();
        Fazer.exibir_info_160cc();
         
        
    }
}
