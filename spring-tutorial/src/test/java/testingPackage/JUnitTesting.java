package testingPackage;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class JUnitTesting {

	@Test
	public void testAdd() {
		int a = 6;
		assertEquals(8,a);
	}
	
	@Test
	public void test()
	{
		int b=4;
		assertEquals(4,b);
	}
	
}
