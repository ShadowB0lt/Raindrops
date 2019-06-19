package com.sparta.siq;

import org.junit.Assert;
import org.junit.Test;


public class RaindropTest {

    private Raindrop raindrop = new Raindrop();

@Test
    public void PlingTest()
    {
        Assert.assertEquals("Pling", raindrop.convertToString(3));
    }

    @Test
    public void PlangTest()
    {
        Assert.assertEquals("Plang", raindrop.convertToString(5));
    }

    @Test
    public void PlongTest()
    {
        Assert.assertEquals("Plong", raindrop.convertToString(7));
    }

    @Test
    public void PlingPlangTest()
    {
        Assert.assertEquals("PlingPlang", raindrop.convertToString(30));
    }

    @Test
    public void PlingPlongTest()
    {
        Assert.assertEquals("PlingPlong", raindrop.convertToString(21));
    }

    @Test
    public void PlangPlongTest()
    {
        Assert.assertEquals("PlangPlong", raindrop.convertToString(35));
    }

    @Test
    public void PlingPlangPlongTest()
    {
        Assert.assertEquals("PlingPlangPlong", raindrop.convertToString(105));
    }

    @Test
    public void OutsideScopeOfFactorsTest()
    {
        Assert.assertEquals("34", raindrop.convertToString(34));
    }

    @Test(expected = IllegalArgumentException.class)
    public void NegativeInputTest()
    {
        raindrop.convertToString(-34);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ZeroInputValueTest()
    {
        raindrop.convertToString(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NegativeNumberWithFactors()
    {
        raindrop.convertToString(-30);
    }
}
