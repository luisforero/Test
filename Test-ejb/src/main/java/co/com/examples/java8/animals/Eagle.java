/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.animals;

import co.com.examples.java8.lambda.Animal;

/**
 *
 * @author Luis Wilmer Forero Romero<luisforero.wr@gmail.com>
 */
public class Eagle extends Animal implements Fly {

    public Eagle() {
        super("Eagle", true, false);
    }
    
    public Eagle(Integer id) {
        super(id,"Eagle", true, false);
    }

    @Override
    public int getWingSpan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
