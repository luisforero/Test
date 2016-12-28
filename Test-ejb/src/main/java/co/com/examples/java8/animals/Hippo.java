/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.animals;

/**
 *
 * @author T14485
 */
public class Hippo extends HeavyAnimal {

    private static final String HIPPO_NAME="HIPPO";
    
    public Hippo() {
        super(HIPPO_NAME);
    }

    @Override
    public String toString(){
        return getSpecies();
    }
}
