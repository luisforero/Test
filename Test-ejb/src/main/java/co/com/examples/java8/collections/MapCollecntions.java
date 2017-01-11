/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.collections;

import co.com.examples.java8.animals.Condor;
import co.com.examples.java8.animals.Elephant;
import co.com.examples.java8.animals.Hippo;
import co.com.examples.java8.lambda.Animal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Luis Wilmer Forero Romero<luisforero.wr@gmail.com>
 */
public class MapCollecntions {

    public static void main(String[] args) {
        Map<String, List<? extends Animal>> hashMap = new HashMap<>();
        Map<String, List<? extends Animal>> treeMap = new TreeMap<>();
        List<Hippo> lstHippos = new ArrayList<>(3);
        lstHippos.add(new Hippo(1));
        lstHippos.add(new Hippo(2));
        lstHippos.add(new Hippo(3));

        hashMap.put("HIPPOS", lstHippos);
        treeMap.put("HIPPOS", lstHippos);

        List<Elephant> lstElephants = new ArrayList<>(4);
        lstElephants.add(new Elephant(1));
        lstElephants.add(new Elephant(2));
        lstElephants.add(new Elephant(3));
        lstElephants.add(new Elephant(4));

        hashMap.put("Elephants", lstElephants);
        treeMap.put("Elephants", lstElephants);

        List<Condor> lstCondors = new ArrayList<>();
        lstCondors.add(new Condor(1));
        lstCondors.add(new Condor(3));
        lstCondors.add(new Condor(4));
        lstCondors.add(new Condor(5));
        lstCondors.add(new Condor(6));

        hashMap.put("Condors", lstCondors);
        treeMap.put("Condors", lstCondors);

        System.out.println("HashMap Animals: " + hashMap);
        System.out.println("TreeMap Animals: " + treeMap);
        
        System.out.println("HashMap Animals contains Condors?: " + hashMap.containsKey("Condors"));
        System.out.println("TreeMap Animals contains Condors?: " + treeMap.containsKey("Condors"));
    }
}
