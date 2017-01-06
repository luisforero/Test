package co.com.examples.java8.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Luis Wilmer Forero Romero<luisforero.wr@gmail.com>
 */
public class SetCollections {

    public static void main(String[] args) {
        String[] array = {"AN", "AB", "OH", "ZO", "NJ", "NA", "NJ", "XJ", "NJ"};

        Set<String> hashSet = new HashSet<>();
        System.out.println("Added to a HashSet: " + hashSet.addAll(Arrays.asList(array)));
        System.out.println("HashSet: " + hashSet);

        Set<String> treeSet = new TreeSet<>();
        System.out.println("Added to a TreeSet: " + treeSet.addAll(Arrays.asList(array)));
        System.out.println("TreeSet: " + treeSet);
        System.out.println("Add 'AN' to TreeSet: " + treeSet.add("AN"));

        NavigableSet<String> navSet = (TreeSet) treeSet;
        System.out.println("NavigableSet: " + navSet);
        System.out.println("Add 'AN' to NavigableSet: " + navSet.add("AN"));
        
        System.out.println("lower('NJ'): "+navSet.lower("NJ"));
        System.out.println("floor('NK'): "+navSet.floor("NK"));
        System.out.println("ceiling('NK'): "+navSet.ceiling("NK"));
        System.out.println("higher('NJ'): "+navSet.higher("NJ"));
        
    }
}
