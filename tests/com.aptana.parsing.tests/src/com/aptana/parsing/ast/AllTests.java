package com.aptana.parsing.ast;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests
{

	public static Test suite()
	{
		TestSuite suite = new TestSuite("Test for com.aptana.parsing.ast");
		//$JUnit-BEGIN$
		suite.addTestSuite(ParseBaseNodeTests.class);
		//$JUnit-END$
		return suite;
	}

}
