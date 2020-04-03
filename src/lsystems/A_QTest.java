package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_QTest {
	LRule rule = new A_Q();
	char expectedMatch = 'A';
	char[] expectedBody = {'Q'};

	@Test
	public void testGetMatch() {
		assertEquals("Expected match " + expectedMatch, expectedMatch, rule.getMatch());
	}
	
	@Test
	public void testGetBody() {
		assertArrayEquals("Body did not match", expectedBody, rule.getBody());
	}
	
}
