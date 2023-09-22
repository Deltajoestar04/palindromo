/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.palidromio;

/**
 *
 * @author Admin
 */
public class poli {
    
    
    public boolean polidromio(String oracion){
        
        
        oracion = oracion.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").replace(" ", "").replace("!", "").replace("¡", "").replace(",", "").replace(".", "");

        char[] caracteres = oracion.toCharArray();

        String reversa = "";
        
        for(int a = caracteres.length-1; a>=0; a--){
            reversa += caracteres[a];
        }
                     
        return oracion.equals(reversa);
    }
    
}