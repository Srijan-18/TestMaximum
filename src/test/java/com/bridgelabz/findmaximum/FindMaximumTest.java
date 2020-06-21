package com.bridgelabz.findmaximum;

import com.bridgelabz.findmaximum.services.FindMaximum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMaximumTest {
    FindMaximum findMaximum;

    @Before
    public void initialize() {
        findMaximum = new FindMaximum();
    }

    @Test
    public void givenIntegerArray_WhenMaximumAtFirstPosition_ShouldReturnFirstValue() {
        Assert.assertEquals((Integer) 50, findMaximum.selectMax(new Integer[]{50, 30, 40}));
    }

    @Test
    public void givenIntegerArray_WhenMaximumAtSecondPosition_ShouldReturnSecondValue() {
        Assert.assertEquals((Integer) 50, findMaximum.selectMax(new Integer[]{40, 50, 30}));
    }

    @Test
    public void givenIntegerArray_WhenMaximumAtThirdPosition_ShouldReturnThirdValue() {
        Assert.assertEquals((Integer) 50, findMaximum.selectMax(new Integer[]{40, 30, 50}));
    }

    @Test
    public void givenFloatArray_WhenMaximumAtFirstPosition_ShouldReturnFirstValue() {
        Assert.assertEquals((Float) 20.7f, findMaximum.selectMax(new Float[]{20.7f, 2.07f, .207f}));
    }

    @Test
    public void givenFloatArray_WhenMaximumAtSecondPosition_ShouldReturnSecondValue() {
        Assert.assertEquals((Float) 20.7f, findMaximum.selectMax(new Float[]{2.07f, 20.7f, .207f}));
    }

    @Test
    public void givenFloatArray_WhenMaximumAtThirdPosition_ShouldReturnThirdValue() {
        Assert.assertEquals((Float) 20.7f, findMaximum.selectMax(new Float[]{2.07f, .207f, 20.7f}));
    }

    @Test
    public void givenStringArray_WhenMaximumAtFirstPosition_ShouldReturnFirstValue() {
        Assert.assertEquals("Peach", findMaximum.selectMax(new String[]{"Peach", "Apple", "Banana"}));
    }

    @Test
    public void givenStringArray_WhenMaximumAtSecondPosition_ShouldReturnSecondValue() {
        Assert.assertEquals("Peach", findMaximum.selectMax(new String[]{"Apple", "Peach", "Banana"}));
    }

    @Test
    public void givenStringArray_WhenMaximumAtThirdPosition_ShouldReturnThirdValue() {
        Assert.assertEquals("Peach", findMaximum.selectMax(new String[]{"Apple", "Banana", "Peach"}));
    }
}
