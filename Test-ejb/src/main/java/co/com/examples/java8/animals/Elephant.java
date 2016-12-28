/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.animals;

/**
 *
 * @author luisforero.wr@gmail.com
 */
public class Elephant extends HeavyAnimal {

    private static final String ELEPHANT_NAME = "ELEPHANT";

    public Elephant() {
        super(ELEPHANT_NAME);
    }

    @Override
    public String toString() {
        return getSpecies();
    }

}
