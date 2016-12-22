/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnocom;

import co.com.examples.java8.A;

/**
 *
 * @author Luis Wilmer Forero Romero<luis.forero@tecnocom.biz>
 */
public class AMain {
    
    public static void main(String[] args){
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        A av=null;
        if(av instanceof A){
            System.out.println("com.tecnocom.AMain.main()");
        }
        boolean bol = Boolean.FALSE;
        c.allTheX();
    }
}
