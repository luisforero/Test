/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8;

import co.com.examples.java8.animals.Hippo;

/**
 *
 * @author T14485
 */
public class ExampleInstanceOf {

    public static void main(String[] args) {
        Hippo mother = new MotherHippo();
        //System.out.println(mother instanceof HeavyAnimal);
//        System.out.println(mother instanceof MotherHippo);
//        System.out.println(null instanceof MotherHippo);
        ExampleInstanceOf eio = new ExampleInstanceOf();
        //System.out.println("RESPUESTA"+eio.metodoRaro());
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.allTheX();
    }

    public String metodoRaro() {
        int[] lista = {8, 9, 3};
        int n = lista.length;
        String[] simbolo = new String[n];
        int i, j, aux, izq, der, m;
        for (i = 1; i < n; i++) {
            aux = lista[i];
            izq = 0;
            der = i - 1;
            while (izq <= der) {
                m = ((izq + der) / 2);
                if (aux < lista[m]) {
                    der = m - 1;
                    simbolo[i - 1] = "-";
                } else {
                    izq = m + 1;
                    simbolo[i - 1] = "+";
                }
            }
            j = i - 1;
            while (j >= izq) {
                lista[j + 1] = lista[j];
                j = j - 1;
            }
            lista[izq] = aux;
        }
        simbolo[i - 1] = "$";

        String salida = "";
        for (i = 0; i < 10; i++) {
            salida += lista[i] + simbolo[i];
        }
        return salida;

    }
}
