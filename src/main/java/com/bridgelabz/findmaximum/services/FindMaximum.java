package com.bridgelabz.findmaximum.services;

public class FindMaximum {

    public static <T extends Comparable> T selectMax (T[] elementArray) {
        T max=elementArray[0];
        for(T element:elementArray) {
            if(max.compareTo(element)<0)
                max=element;
        }
            return max;
    }
}