/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnocom;

/**
 *
 * @author Luis Wilmer Forero Romero<luisforero.wr@gmail.com>
 */
public class FourLegged {
    String walk = "walk,";
    static class Baby extends FourLegged{
        String walk="todle,";
    }
    
    public static void main(String[]args){
        FourLegged f = new Baby();
        Baby b = new Baby();
        System.err.println(f.walk);
        System.err.println(b.walk);
    }
}
