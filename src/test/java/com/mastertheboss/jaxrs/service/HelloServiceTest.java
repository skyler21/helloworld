package com.mastertheboss.jaxrs.service;

import org.testng.annotations.Test;

public class HelloServiceTest {

  @Test(enabled=false)
  public void getHelloTest1() {
    throw new RuntimeException("Test not implemented");
  }
  @Test
  public void getHelloTest2() {
	  System.out.println("getHelloTest2 reached !");  
  }
}
