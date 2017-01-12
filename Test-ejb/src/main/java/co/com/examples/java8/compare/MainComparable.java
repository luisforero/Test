/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.compare;

import co.com.examples.java8.animals.Duck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Luis Wilmer Forero Romero<luisforero.wr@gmail.com>
 */
public class MainComparable {
    public static void main(String[] args) {
        List<Duck> lstDucks= new ArrayList<>();
        lstDucks.add(new Duck(5));
        lstDucks.add(new Duck(1));
        lstDucks.add(new Duck(3));
        lstDucks.add(new Duck(2));
        Collections.sort(lstDucks);
        System.out.println("Ducks List: "+lstDucks);
    }
}
