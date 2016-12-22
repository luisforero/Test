/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Luis Wilmer Forero Romero<luis.forero@tecnocom.biz>
 */
public class ArraysListColections {

    public static void printNames(List list) {
        for (int i = 0; i < list.size(); i++) {
            String name = (String) list.get(i);
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Integer[] array = {9, 3, 1, 7, 5, 6, 12, 13};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 7));
        System.out.println(Arrays.binarySearch(array, 11));

        List l = Arrays.asList(array);
        Collections.sort(l);
        System.out.println(l.toString());
        System.out.println(Collections.binarySearch(l, 7));
        System.out.println(Collections.binarySearch(l, 11));

        List names = new ArrayList();
        names.add(new StringBuilder("Hola"));
        printNames(names);
    }
}
