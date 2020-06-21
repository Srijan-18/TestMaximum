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
        findMaximum=new FindMaximum("SAM", "AMS", "MSA");
        Assert.assertEquals( "SAM", findMaximum.selectMax());
    }
    @Test
    public void givenIntegerArray_WhenMaximumAtSecondPosition_ShouldReturnSecondValue() {
        Assert.assertEquals( 50, new FindMaximum(40, 50, 30).selectMax());
    }

    @Test
    public void givenIntegerArray_WhenMaximumAtThirdPosition_ShouldReturnThirdValue() {
        Assert.assertEquals( 50, new FindMaximum(40, 30, 50).selectMax());
    }

    @Test
    public void givenFloatArray_WhenMaximumAtFirstPosition_ShouldReturnFirstValue() {
        Assert.assertEquals(20.7f, new FindMaximum(20.7f, 2.07f, .207f).selectMax());
    }

    @Test
    public void givenFloatArray_WhenMaximumAtSecondPosition_ShouldReturnSecondValue() {
        Assert.assertEquals(20.7f, new FindMaximum(2.07f, 20.7f, .207f).selectMax());
    }

    @Test
    public void givenFloatArray_WhenMaximumAtThirdPosition_ShouldReturnThirdValue() {
        Assert.assertEquals(20.7f, new FindMaximum(2.07f, .207f, 20.7f).selectMax());
    }

    @Test
    public void givenStringArray_WhenMaximumAtFirstPosition_ShouldReturnFirstValue() {
        Assert.assertEquals("Peach", new FindMaximum("Peach", "Apple", "Banana").selectMax());
    }

    @Test
    public void givenStringArray_WhenMaximumAtSecondPosition_ShouldReturnSecondValue() {
        Assert.assertEquals("Peach", new FindMaximum( "Apple","Peach", "Banana").selectMax());
    }

    @Test
    public void givenStringArray_WhenMaximumAtThirdPosition_ShouldReturnThirdValue() {
        Assert.assertEquals("Peach", new FindMaximum("Apple", "Banana", "Peach").selectMax());
    }
}
