/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.animals;

import java.io.IOException;

/**
 *
 * @author Luis Wilmer Forero Romero<luis.forero@tecnocom.biz>
 */
public interface Fly {
   public int getWingSpan()throws IOException;
   public static final int MAX_SPEED=100;
   
   public default void land(){
       System.out.println("Animal is landing");
   }
   
   public static double calculateSpeed(float distance,double time){
       return distance/time;
   }
}
