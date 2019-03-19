package com.testRunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import testingPackage.JUnitTesting;

public class TestRunner {

	   public static void main(String[] args) {
		      Result result = JUnitCore.runClasses(JUnitTesting.class);
			  System.out.println("Total test cases: "+ result.getRunCount());
		      for (Failure failure : result.getFailures()) {
		         System.out.println(failure.toString());
		      }
				
		      System.out.println(result.wasSuccessful());
		   }

}
