package com.ryan;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter {

    @Test
    @Parameters({"param", "param2"})
    public void printParameters(String param, String param2){
        System.out.println("param参数值为 ： " + param);
        System.out.println("param2参数值为 ： " + param2);
    }
}