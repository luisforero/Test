/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnocom;

/**
 *
 * @author Luis Wilmer Forero Romero<luis.forero@tecnocom.biz>
 */
public interface Otter {

    public default void play(){}
    
    public default void otherPlay(){
            
    }
    
    public static int calcular(int calcular){
        return calcular;
    }
}
