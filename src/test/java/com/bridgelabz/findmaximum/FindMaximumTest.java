package com.bridgelabz.findmaximum;

import com.bridgelabz.findmaximum.services.FindMaximum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMaximumTest {
    FindMaximum findMaximum;

    @Before
    public void initialize() {
        findMaximum=new FindMaximum();
    }

    @Test
    public void givenIntegerArray_WhenMaximumAtFirstPosition_ShouldReturnFirstValue() {
        Assert.assertEquals((Integer)50,findMaximum.selectMax(new Integer[]{50, 30, 40}));
    }

    @Test
    public void givenIntegerArray_WhenMaximumAtSecondPosition_ShouldReturnSecondValue() {
        Assert.assertEquals((Integer)50,findMaximum.selectMax(new Integer[]{40, 50, 30}));
    }

    @Test
    public void givenIntegerArray_WhenMaximumAtThirddPosition_ShouldReturnThirdValue() {
        Assert.assertEquals((Integer)50,findMaximum.selectMax(new Integer[]{40,30,50}));
    }
}
