/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.animals;

import co.com.examples.java8.lambda.Animal;

/**
 *
 * @author T14485
 */
public class HeavyAnimal extends Animal {
    
    public HeavyAnimal() {
        super("Unknowing", false, false);
    }
    
    public HeavyAnimal(String name) {
        super(name, true, false);
    }
    
}
