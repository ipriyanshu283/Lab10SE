package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class T1 {

	@Test
	public void test() {
		JUnitFunctions JUnit = new JUnitFunctions();
		int result = JUnit.addnum(100, 200);
		assertEquals(300, result);	
	}

}
