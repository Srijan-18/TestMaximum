package com.bridgelabz.findmaximum.services;

public class FindMaximum {
    /**
     * Method find maximum Integer using compareTo method
     * @param integerArray
     * @return maximum
     */
    public Integer selectMax(Integer[] integerArray) {
    Integer max=integerArray[0];
    for(Integer i:integerArray){
        if(max.compareTo(i)<0)
            max=i;
    }
    return max;
    }
}
