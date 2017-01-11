/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.animals;

import co.com.examples.java8.lambda.Animal;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author Luis Wilmer Forero Romero<luisforero.wr@gmail.com>
 */
public class Duck extends Animal implements Comparable<Duck> {

    private static final String SPECIES_NAME = "DUCK";

    public Duck() {
        super(SPECIES_NAME, true, true);
    }
    
    public Duck(Integer id) {
        super(id, SPECIES_NAME, true, true);
    }

    @Override
    public int compareTo(Duck o) {
        return o.getId().compareTo(this.getId());
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

}
