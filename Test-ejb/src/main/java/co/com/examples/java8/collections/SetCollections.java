package co.com.examples.java8.collections;

import java.util.Arrays;
import java.util.HashSet;
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
        hashSet.addAll(Arrays.asList(array));
        System.out.println(hashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(array));
        System.out.println(treeSet);
    }
}
