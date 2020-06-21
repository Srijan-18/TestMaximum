package com.bridgelabz.findmaximum;

import com.bridgelabz.findmaximum.services.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void givenIntegerArray_WhenMaximumAtFirstPosition_ShouldReturnFirstValue() {
        Assert.assertEquals(50, new FindMaximum(50, 30, 40).testMaximum());
    }

    @Test
    public void givenIntegerArray_WhenMaximumAtSecondPosition_ShouldReturnSecondValue() {
        Assert.assertEquals(50, new FindMaximum(40, 50, 30).testMaximum());
    }

    @Test
    public void givenIntegerArray_WhenMaximumAtThirdPosition_ShouldReturnThirdValue() {
        Assert.assertEquals(50, new FindMaximum(40, 30, 50).testMaximum());
    }

    @Test
    public void givenFloatArray_WhenMaximumAtFirstPosition_ShouldReturnFirstValue() {
        Assert.assertEquals(20.7f, new FindMaximum(20.7f, 2.07f, .207f).testMaximum());
    }

    @Test
    public void givenFloatArray_WhenMaximumAtSecondPosition_ShouldReturnSecondValue() {
        Assert.assertEquals(20.7f, new FindMaximum(2.07f, 20.7f, .207f).testMaximum());
    }

    @Test
    public void givenFloatArray_WhenMaximumAtThirdPosition_ShouldReturnThirdValue() {
        Assert.assertEquals(20.7f, new FindMaximum(2.07f, .207f, 20.7f).testMaximum());
    }

    @Test
    public void givenStringArray_WhenMaximumAtFirstPosition_ShouldReturnFirstValue() {
        Assert.assertEquals("Peach", new FindMaximum("Peach", "Apple", "Banana").testMaximum());
    }

    @Test
    public void givenStringArray_WhenMaximumAtSecondPosition_ShouldReturnSecondValue() {
        Assert.assertEquals("Peach", new FindMaximum("Apple", "Peach", "Banana").testMaximum());
    }

    @Test
    public void givenStringArray_WhenMaximumAtThirdPosition_ShouldReturnThirdValue() {
        Assert.assertEquals("Peach", new FindMaximum("Apple", "Banana", "Peach").testMaximum());
    }

    @Test
    public void givenArray_WhenLengthIsMoreThanThreeElements_ShouldReturnMaximumValueElement() {
        Assert.assertEquals("Zen", new FindMaximum("Apple", "Banana", "Zen", "Peach", "Pineapple").testMaximum());
    }

    @Test
    public void givenArray_WhenLengthIsLessThanThreeElements_ShouldReturnMaximumValueElement() {
        Assert.assertEquals("Zen", new FindMaximum("Zen", "Apple").testMaximum());
    }
    @Test
    public void givenIntegerArray_WhenLengthIsMoreThanThreeElements_ShouldReturnMaximumValueElement() {
        Assert.assertEquals(50, new FindMaximum(10,20,30,50,40).testMaximum());
    }

    @Test
    public void givenIntegerArray_WhenLengthIsLessThanThreeElements_ShouldReturnMaximumValueElement() {
        Assert.assertEquals(50, new FindMaximum(40, 50).testMaximum());
    }
    @Test
    public void givenFloatArray_WhenLengthIsMoreThanThreeElements_ShouldReturnMaximumValueElement() {
        Assert.assertEquals( 20.7f, new FindMaximum(.00207f,20.7f,2.07f,.0207f).testMaximum());
    }

    @Test
    public void givenFloatArray_WhenLengthIsLessThanThreeElements_ShouldReturnMaximumValueElement() {
        Assert.assertEquals(20.7f, new FindMaximum(20.7f,2.07f).testMaximum());
    }

}