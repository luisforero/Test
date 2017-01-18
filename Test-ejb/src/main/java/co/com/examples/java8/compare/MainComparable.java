/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.compare;

import co.com.examples.java8.animals.Condor;
import co.com.examples.java8.animals.Duck;
import co.com.examples.java8.animals.Elephant;
import co.com.examples.java8.animals.Hippo;
import co.com.examples.java8.lambda.Animal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Luis Wilmer Forero Romero<luisforero.wr@gmail.com>
 */
public class MainComparable {

    public static void main(String[] args) {
        List<Duck> lstDucks = new ArrayList<>();
        lstDucks.add(new Duck(5, "Hugo", 52.1));
        lstDucks.add(new Duck(1, "Paco", 53.5));
        lstDucks.add(new Duck(3, "Luis", 50.0));
        lstDucks.add(new Duck(2, "Lukas", 89.2));
        Collections.sort(lstDucks);
        System.out.println("Ducks List: " + lstDucks);

        // Organize Ascendent order With implementation Interface
        System.out.println("**** With implementation Interface ****");
        List<Animal> lstAnimals = new ArrayList<>();
        lstAnimals.add(new Duck(5));
        lstAnimals.add(new Duck(1));
        lstAnimals.add(new Hippo(89));
        lstAnimals.add(new Duck(3));
        lstAnimals.add(new Condor(4));
        lstAnimals.add(new Duck(2));
        lstAnimals.add(new Elephant(5));

        Collections.sort(lstAnimals, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getId().compareTo(o2.getId());
            }
        }
        );
        System.out.println("Animals List Ascendent: " + lstAnimals);

        // sort with Lambda Expression in Descendent order
        Collections.sort(lstAnimals, (o1, o2) -> {
            return o2.getId().compareTo(o1.getId());
        });

        System.out.println("Animals List Descendent: " + lstAnimals);
        Collections.sort(lstDucks, (Animal o1, Animal o2) -> o2.getId().compareTo(o1.getId()));
        System.out.println("Ducks List Descendent Id: " + lstDucks);

        Collections.sort(lstDucks, (Duck o1, Duck o2) -> {
            return o2.getName().compareTo(o1.getName());
        });
        System.out.println("Ducks list Ascendent Name:" + lstDucks);

        Collections.sort(lstDucks, (o1, o2) -> o1.getName().length() - o2.getName().length());
        System.out.println("Ducks list Ascendent Name length:" + lstDucks);

        Comparator<Duck> comparator = new Comparator<Duck>() {
            @Override
            public int compare(Duck o1, Duck o2) {
                Comparator<Duck> c = Comparator.comparing((s) -> s.getName());
                c = c.thenComparing((s) -> s.getWeight());
                return c.compare(o1, o2);
            }
        };

        Collections.sort(lstDucks, comparator);
        System.out.println("Duck List other orden: " + lstDucks);

        // SEARCHING AND SORTING
        System.out.println("**** SEARCHING AND SORTING ****");
        List<String> names = Arrays.asList("Fluppy", "Hoppy");
        Comparator<String> c = Comparator.reverseOrder();
        int index = Collections.binarySearch(names, "Hoppy", c);
        System.out.println("Names List without sort: " + names);
        System.out.println("Binary Search 'Hoppy' with comparator reverse: " + index);
        Collections.sort(names,c);
        System.out.println("Names List sorted reverse: " + names);
        index = Collections.binarySearch(names, "Hoppy", c);
        System.out.println("Binary Search 'Hoppy': " + index);

        //Set<Animal> 
    }
}
