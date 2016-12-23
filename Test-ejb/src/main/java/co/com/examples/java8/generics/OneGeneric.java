/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examples.java8.generics;

import java.util.List;

/**
 *
 * @author Luis Wilmer Forero Romero<luis.forero@tecnocom.biz>
 * @param <E>
 */
public class OneGeneric<E> {

    private E numeric;
    private List<E> listElements;

    public List<E> getListElements() {
        return listElements;
    }

    public void setListElements(List<E> listElements) {
        this.listElements = listElements;
    }

    public OneGeneric(E numeric, List<E> listElements) {
        this.numeric = numeric;
        this.listElements = listElements;
    }

    public E getNumeric() {
        return numeric;
    }

    public void setNumeric(E numeric) {
        this.numeric = numeric;
    }
}
