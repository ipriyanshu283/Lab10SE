package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class T2 {

	@Test
	public void test() {
		JUnitFunctions JUnit = new JUnitFunctions();
		String result = JUnit.addstring("H", "H");
		assertEquals("HH", result);
	}

}
