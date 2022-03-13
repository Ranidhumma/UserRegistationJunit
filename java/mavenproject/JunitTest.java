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

		boolean result = j.FirstName("Ranii");
		// assertTrue(result);
		assertEquals(true, result);
	}

	/* this Test case is used to check our last name passes given regex pattern */
	@Test
	public void testLastName() {

		boolean result = j.LastName("dhummA");
		// assertTrue(result);
		assertEquals(true, result);
	}

	/* this Test case is used to check our email passes given regex pattern */
	@Test
	public void testEmail() {

		boolean result = j.Email("xyz.abc@bl.co.in");
		// assertTrue(result);
		assertEquals(true, result);
	}
}