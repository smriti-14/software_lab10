package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitFunctions obj = new JUnitFunctions();
		int d = obj.add(14, 15);
		assertEquals(29,d);
	}

}
