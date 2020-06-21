package com.bridgelabz.findmaximum.services;

public class FindMaximum {
    /**
     * Method find maximum Integer using compareTo method
     *
     * @param integerArray
     * @return maximum
     */
    public Integer selectMax(Integer[] integerArray) {
        Integer max;
        max=integerArray[0];
        for (Integer i : integerArray) {
            if (max.compareTo(i) < 0)
                    max = i;
        }
        return max;
    }

    /**
     *Method to find maximum Float using compareTo method
     * @param floatArray
     * @return max
     */
    public Float selectMaxFloat(Float[] floatArray){
        Float max;
        max=floatArray[0];
        for (Float i : floatArray) {
            if (max.compareTo(i) < 0)
                max = i;
        }
        return max;
    }
    /**
     *Method to find maximum String using compareTo method
     * @param stringArray
     * @return max
     */
    public String selectMaxString(String[] stringArray) {
        String max;
        max = stringArray[0];
        for (String s : stringArray) {
            if (max.compareTo(s) < 0)
                max = s;
        }
        return max;
    }
}