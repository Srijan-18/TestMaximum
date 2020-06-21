package com.bridgelabz.findmaximum.services;

import java.util.Arrays;

public class FindMaximum<T extends Comparable> {
    private T elements[];

    public FindMaximum() {
    }

    /**
     * Parameterised Constructor to initialise the array
     * @param elements
     */

    public FindMaximum(T... elements) {
        this.elements = elements;
    }

    /**
     * Method to evaluate Sort the input and return maximum
     * @param <T>
     * @return Maximum Element of all the elements entered
     */
    public <T extends Comparable> T testMaximum() {
        Arrays.sort(elements);
        printMax(elements[elements.length - 1]);
        return (T) elements[elements.length - 1];
    }

    /**
     * Generic Method to print maximum Value of the class variable array.
     * @param maxElement
     * @param <T>
     */
    public <T> void printMax(T maxElement) {
        System.out.println("The Maximum Valued Input is: " + maxElement);
    }
}