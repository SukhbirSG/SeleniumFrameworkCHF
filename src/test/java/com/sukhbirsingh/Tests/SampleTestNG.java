package com.sukhbirsingh.Tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestNG {
    @Description("Dry Run")
    @Test
    public void Test_Sample(){
        Assert.assertTrue(true);
    }
    @Description("Dry Run 1")
    @Test
    public void Test_Sample1(){
        Assert.assertTrue(true);
    }
}
