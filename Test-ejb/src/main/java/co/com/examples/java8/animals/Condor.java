/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.animals;

import java.io.IOException;

/**
 *
 * @author Luis Wilmer Forero Romero<luisforero.wr@gmail.com>
 */
public class Condor implements Fly{
    
    @Override
    public int getWingSpan() throws IOException {
        System.out.println("GetWingSpan");
        return 2;
    }
    
}
