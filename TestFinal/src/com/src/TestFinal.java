package com.src;

import java.util.ArrayList;
import java.util.List;

public class TestFinal {


  private final List foo;

  public TestFinal()
  {
      foo = new ArrayList();
      foo.add("foo"); // Modification-1
  }
  public static void main(String[] args) 
  {
	  TestFinal t = new TestFinal();
      t.foo.add("bar"); // Modification-2
      System.out.println("print - " + t.foo);
  }
}