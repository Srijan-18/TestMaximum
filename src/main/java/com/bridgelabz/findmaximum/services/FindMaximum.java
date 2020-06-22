package com.bridgelabz.findmaximum.services;

import java.util.Arrays;

public class FindMaximum<TypeT extends Comparable> {
    private TypeT elements[];

    public FindMaximum() {
    }

    /**
     * Parameterised Constructor to initialise the array
     * @param elements
     */

    public FindMaximum(TypeT... elements) {
        this.elements = elements;
    }

    /**
     * Method to evaluate Sort the input and return maximum
     * @return Maximum Element of all the elements entered
     */
    public TypeT testMaximum() {
        Arrays.sort(elements);
        printMax(elements[elements.length - 1]);
        return (TypeT) elements[elements.length - 1];
    }

    /**
     * Generic Method to print maximum Value of the class variable array.
     * @param maxElement
     */
    public void printMax(TypeT maxElement) {
        System.out.println("The Maximum Valued Input is: " + maxElement);
    }
}