/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.generics;

import co.com.examples.java8.animals.Condor;
import co.com.examples.java8.animals.Elephant;
import co.com.examples.java8.animals.HeavyAnimal;
import co.com.examples.java8.animals.Hippo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Wilmer Forero Romero<luis.forero@tecnocom.biz>
 */
public class MainGenerics {

    public static void main(String[] args) {
        Crate<HeavyAnimal> elephantCrate = new Crate<>();
        elephantCrate.packCrate(new Elephant());

        List<SizeLimitedCrate<HeavyAnimal, Integer>> list = new ArrayList<>();
        list.add(new SizeLimitedCrate<>(elephantCrate.emptyCrate(), 100));
        list.add(new SizeLimitedCrate<>(new Hippo(), 20));
        //list.add(new SizeLimitedCrate<>(new Condor(), 100));
        System.err.println(list.toString());
    }
}
