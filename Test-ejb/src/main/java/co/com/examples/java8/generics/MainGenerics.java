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
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Luis Wilmer Forero Romero<luis.forero@tecnocom.biz>
 */
public class MainGenerics {
    
    static class OtherStatic {
        
        private final String hi = "Hi";
        
        @Override
        public String toString() {
            return hi;
        }
    }
    
    public static void main(String[] args) {
        Crate<HeavyAnimal> elephantCrate = new Crate<>();
        elephantCrate.packCrate(new Elephant());
        
        List<SizeLimitedCrate<HeavyAnimal, Integer>> list = new ArrayList<>();
        list.add(new SizeLimitedCrate<>(elephantCrate.emptyCrate(), 100));
        list.add(new SizeLimitedCrate<>(new Hippo(), 20));
        //list.add(new SizeLimitedCrate<>(new Condor(), 100));
        System.err.println(list.toString());
        
        List<OtherStatic> listOtherStatic = new ArrayList<>();
        listOtherStatic.add(new OtherStatic());
        
        System.out.println(listOtherStatic.get(0).hi);
        
        OtherStatic[][] others = {{new OtherStatic()}};
        System.out.println(Arrays.toString(others));

        // FIXED This not allowed
        // OneGeneric<int> oneGeneric=new OneGeneric<>(123);
        // System.out.println(oneGeneric.getNumeric());
        int[] array = {1, 2, 3};
        OneGeneric<Integer> oneGeneric = new OneGeneric<>(123, new ArrayList<Integer>(Arrays.asList(array)));
        // System.out.println(oneGeneric.getNumeric());
        
    }
}
