/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.conidicionalsMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Luis Wilmer Forero Romero<luisforero.wr@gmail.com>
 */
public class TestMain {
    
    public static void main(String[] args) {
        
        // ***************************
        // ******** List *************
        // ***************************
        
        List<String> list = new ArrayList<>();
        list.add("Irland");
        list.add("Scotland");
        list.add("Colombia");
        list.add("England");
        list.add("US");
        System.err.println("List: " + list);
        // In this case do it:
        list.removeIf(str -> str.startsWith("S"));
        System.out.println("List After removeIf(StartsWith (S)): " + list);
        // In these cases doesn't do it:
        String s = "C";
        Predicate<String> predicate1 = s::startsWith;
        list.removeIf(predicate1);
        System.out.println("List After removeIf(StartsWith (C)): " + list);
        
        list.removeIf("E"::startsWith);
        System.out.println("List After removeIf(StartsWith (E)): " + list);
        
        List<Integer> asList = Arrays.asList(1, 2, 3);
        System.out.println("List integers: " + asList);
        asList.replaceAll(x -> x * 2);
        System.out.println("Replace all: " + asList);
        
        System.out.println("For each list: ");
        list.forEach(c -> System.out.println(c ));
        System.out.println("OR FOR EACH :: LAMBDA EXPRESSION");
        list.forEach(System.out::println);
    }
}
