/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.generics;

/**
 *
 * @author Luis Wilmer Forero Romero<luisforero.wr@gmail.com>
 */
public class WrongObjects {

    public static void main(String[] args) {
        Integer[] integers = {2};
        Object[] objects = integers;
        objects[0] = "forty two";//Exception in thread "main" java.lang.ArrayStoreException: java.lang.String
    }
}
