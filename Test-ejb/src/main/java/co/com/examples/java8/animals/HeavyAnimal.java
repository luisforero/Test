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
public class HeavyAnimal {

    public HeavyAnimal(){
    }

    public HeavyAnimal(String name){
        this.name= name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String name;

}
