package com.ryan;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestConfig {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("测试套件(当前xml中<suite>标签)之前运行@BeforeSuite--------------------");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("测试套件(当前xml中<suite>标签)之后运行@AfterSuite--------------------\n");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("测试用例(当前xml中<test>标签)之前运行@BeforeTest----------");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("测试用例(当前xml中<test>标签)之后运行@AfterTest----------\n");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("当前类每个测试方法(@Test)之前运行@BeforeMethod");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("当前类每个测试方法(@Test)之后运行@AfterMethod");
    }

    @BeforeGroups(value="group1")
    public void beforeGroups(){
        System.out.println("配置组配group1之前运行@BeforeGroups..................");
    }
    @AfterGroups(value="group1")
    public void afterGroups(){
        System.out.println("配置组配group1之前运行@AfterGroups..................");
    }

    @Test
    public void test1(){
        System.out.println("runnig TestConfig.test1()");
    }

    @Test(groups = "group1")
    public void test2(){
        System.out.println("runnig TestConfig.test2()");
    }

    @Test(groups = "group1")
    public void test3(){
        System.out.println("runnig TestConfig.test3()");
    }

}