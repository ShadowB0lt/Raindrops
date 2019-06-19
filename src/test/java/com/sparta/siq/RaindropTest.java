package com.sparta.siq;

import org.junit.Assert;
import org.junit.Test;

public class RaindropTest {

    Raindrop inputvalue = new Raindrop();

@Test
    public void PlingTest()
    {
        Assert.assertEquals("Pling",inputvalue.factor(3));
    }

    @Test
    public void PlangTest()
    {
        Assert.assertEquals("Plang",inputvalue.factor(5));
    }

    @Test
    public void PlongTest()
    {
        Assert.assertEquals("Plong",inputvalue.factor(7));
    }

    @Test
    public void PlingPlangTest()
    {
        Assert.assertEquals("PlingPlang",inputvalue.factor(30));
    }

    @Test
    public void PlingPlongTest()
    {
        Assert.assertEquals("PlingPlong",inputvalue.factor(21));
    }

    @Test
    public void PlangPlongTest()
    {
        Assert.assertEquals("PlangPlong",inputvalue.factor(35));
    }

    @Test
    public void PlingPlangPlongTest()
    {
        Assert.assertEquals("PlingPlangPlong",inputvalue.factor(105));
    }

    @Test
    public void OutsideScopeOfFactorsTest()
    {
        Assert.assertEquals("34",inputvalue.factor(34));
    }

    @Test
    public void NegativeInputTest()
    {
        Assert.assertNotEquals("-34",inputvalue.factor(-34));
    }

    @Test
    public void ZeroInputValueTest()
    {
        Assert.assertEquals("",inputvalue.factor(0));
    }
}
