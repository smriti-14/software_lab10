package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitFunctions obj = new JUnitFunctions();
		String w = obj.str("Smriti", "Agarwal");
		assertEquals("SmritiAgarwal",w);
	}

}
