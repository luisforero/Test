/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.generics;

import co.com.examples.java8.animals.Elephant;
import co.com.examples.java8.animals.HeavyAnimal;
import co.com.examples.java8.animals.Hippo;
import co.com.examples.java8.lambda.Animal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Luis Wilmer Forero Romero<luisforero.wr@gmail.com>
 */
public class MainGenerics {

    static class OtherStatic {

        private final String hi = "Hi";

        @Override
        public String toString() {
            return hi;
        }
    }

    /**
     * The WildCard is allowed in a method not in classes
     *
     * @param list
     */
    public static void process(List<? extends Animal> list) {

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
//        try {
//            // 
//            OneGeneric<Integer> oneGeneric = new OneGeneric<>(123, new ArrayList<Integer>(Arrays.asList(array)));
//            System.out.println(oneGeneric.getNumeric().toString());
//        } catch (RuntimeException ex) {
//            System.err.println(ex.getMessage() + "\nCause:" + ex.getCause());
//        }

        System.out.println("******** Lambda Expression Execution ********");
        System.out.println(doExpressionLambda(new Animal("Elephant", true, false), a -> a.toString()));
        System.out.println(doExpressionLambda(new Hippo(), a -> a.toString()));
        System.out.println(doExpressionLambda(18, n -> n.toString()));
        System.out.println(doExpressionLambda(new Exception("Exception with Lambda expression"), n -> n.getMessage()));

        List<String> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        System.out.println(l1.getClass() == l2.getClass());
        System.out.println(l1.getClass());
        System.out.println(l2.getClass());

        Collection cs = new ArrayList<String>();
        // This is a compilation error
//        try {
//            if (cs instanceof Collection<String>) {
//                System.out.println("Enter to a instance of");
//            }
//        } catch (RuntimeException ex) {
//            System.err.println(ex);
//        }

        // Not really allowed.
//        List<String>[] lsa = new List<String>[10];
//        Object o = lsa;
//        Object[] oa = (Object[]) o;
//        List<Integer> li = new ArrayList<Integer>();
//        li.add(new Integer(3));
        // Unsound, but passes run time store check
//        oa[1] = li;

        // Run-time error: ClassCastException.
//        String s = lsa[1].get(0);

    }

    // ** ERROR IMPLEMENTATION BECOUSE MISSING <E> TO GENERIC METHOD
//    private static String doExpressionLambda(E a, GenericLambda generic){
//        return generic.expression(a);
//    }
    private static <E> String doExpressionLambda(E a, GenericLambda<E> generic) {
        return generic.expression(a);
    }
    
    /**
     * Doesn´t compile
     */
//    private static <E> void returnE(List<E super Number> list){
//    }
}
