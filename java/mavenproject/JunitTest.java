package mavenproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTest {
	JunitUserReg j = new JunitUserReg();

	/*
	 * this Test case is used to check our first name passes given regex pattern
	 */

	@Test
	public void testFirstName() {

		boolean result = j.FirstName("Rani");
		// assertTrue(result);
		assertEquals(true, result);
	}
}
