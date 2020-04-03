package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_AATest {
	LRule rule = new A_AA();
	char expectedMatch = 'A';
	char[] expectedBody = {'A', 'A'};

	@Test
	public void testGetMatch() {
		assertEquals("Expected match " + expectedMatch, expectedMatch, rule.getMatch());
	}
	
	@Test
	public void testGetBody() {
		assertArrayEquals("Body did not match", expectedBody, rule.getBody());
	}
	
}
