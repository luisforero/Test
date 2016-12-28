/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Wilmer Forero Romero<luis.forero@tecnocom.biz>
 */
public class LegacyDragons {

    public static void main(String[] args) {
        List unicorns = new ArrayList();
        unicorns.add(new Unicorn());
        printDragos(unicorns);
    }

    public static void printDragos(List<Dragon> dragons) {
        dragons.forEach((dragon) -> {
            //ClassCastException
            System.out.println(dragon);
        });
    }
}
