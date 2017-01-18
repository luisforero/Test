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
public class Duck extends Animal implements Comparable {
    // If don't specifies generic type of Comparable<T> this take
    // the Object Type

    private static final String SPECIES_NAME = "DUCK";

    private String name;

    public Duck() {
        super(SPECIES_NAME, true, true);
        this.name = "Anonimus";
    }

    public Duck(Integer id) {
        super(id, SPECIES_NAME, true, true);
        this.name = "Anonimus";
    }

    public Duck(Integer id, String name) {
        super(id, SPECIES_NAME, true, true);
        this.name = name;
    }

    public Duck(Integer id, String name, double weight) {
        super(id, SPECIES_NAME, true, true, weight);
        this.name = name;
    }

//    @Override
//    public int compareTo(Duck o) {
//        return this.getId().compareTo(o.getId());
//    }
    @Override
    public int compareTo(Object o) {
        return this.getId().compareTo(((Animal) o).getId());
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public String toString() {
        return "The " + name + " " + getSpecies() + 
                " has ID -> '" + this.getId() + "' "
                + "And his weight is " + this.getWeight();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
