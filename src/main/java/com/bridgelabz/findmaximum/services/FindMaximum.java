package com.bridgelabz.findmaximum.services;

public class FindMaximum<T extends Comparable>  {
    private T element1,element2,element3;
    public FindMaximum() {
    }

    public FindMaximum(T element1, T element2, T element3){
        this.element1=element1;
        this.element2=element2;
        this.element3=element3;
    }

    public <T extends Comparable> T selectMax () {
        if (element1.compareTo(element2)>0 && element1.compareTo(element3)>0)
            return (T)element1;
        else if (element1.compareTo(element2)<0 && element2.compareTo(element3)>0)
            return (T)element2;
        else
            return (T)element3;
        }
    }