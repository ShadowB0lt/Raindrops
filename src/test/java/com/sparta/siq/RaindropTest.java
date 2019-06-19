package com.sparta.siq;

import org.junit.Assert;
import org.junit.Test;

public class RaindropTest {

    Raindrop inputvalue = new Raindrop();

@Test
    public void PlingTest()
    {
        Assert.assertEquals("Pling",inputvalue.convertToString(3));
    }

    @Test
    public void PlangTest()
    {
        Assert.assertEquals("Plang",inputvalue.convertToString(5));
    }

    @Test
    public void PlongTest()
    {
        Assert.assertEquals("Plong",inputvalue.convertToString(7));
    }

    @Test
    public void PlingPlangTest()
    {
        Assert.assertEquals("PlingPlang",inputvalue.convertToString(30));
    }

    @Test
    public void PlingPlongTest()
    {
        Assert.assertEquals("PlingPlong",inputvalue.convertToString(21));
    }

    @Test
    public void PlangPlongTest()
    {
        Assert.assertEquals("PlangPlong",inputvalue.convertToString(35));
    }

    @Test
    public void PlingPlangPlongTest()
    {
        Assert.assertEquals("PlingPlangPlong",inputvalue.convertToString(105));
    }

    @Test
    public void OutsideScopeOfFactorsTest()
    {
        Assert.assertEquals("34",inputvalue.convertToString(34));
    }

    @Test
    public void NegativeInputTest()
    {
        Assert.assertNotEquals("-34",inputvalue.convertToString(-34));
    }

    @Test
    public void ZeroInputValueTest()
    {
        Assert.assertEquals("",inputvalue.convertToString(0));
    }
}
