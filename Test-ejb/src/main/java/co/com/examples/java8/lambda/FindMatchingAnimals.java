/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.lambda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Luis Wilmer Forero Romero<luis.forero@tecnocom.biz>
 */
public class FindMatchingAnimals {

    public static void print(Animal a, CheckTrait checkTrait) {
        if (checkTrait.test(a)) {
            System.out.println(a.toString());
        }
    }

    public static void print(double speed, int distance, Swim swim) {
        System.err.println(swim.swim(speed, distance));
    }

    public static void main(String[] args) {
        print(new Animal("Fish", false, true), a -> a.isCanHop());
        print(new Animal("Kangaroo", true, false), a -> a.isCanHop());
        print(12.2, 5, (s, d) -> s * d);
        try (BufferedReader buffer = new BufferedReader(new FileReader("hola.txt"))) {
            buffer.read();
        } catch (IOException ex) {
            System.err.print("IOEXCEPTION:\n");
            ex.printStackTrace();
        } catch (NullPointerException | ArithmeticException e) {
            e.printStackTrace();
        }
        //System.out.println(()->{return });
    }

}
