/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.generics;

import co.com.examples.java8.animals.HeavyAnimal;

/**
 *
 * @author Luis Wilmer Forero Romero<luisforero.wr@gmail.com>
 */
public class SizeLimitedCrate<T extends HeavyAnimal, u extends Number> {

    private T contents;
    private u sizeLimit;

    public SizeLimitedCrate(T contents, u sizeLimit) {
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }

    @Override
    public String toString() {
        return "Crate of " + contents.toString() + " Whit " + sizeLimit.toString();
    }
}
