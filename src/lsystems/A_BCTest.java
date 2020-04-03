package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_BCTest {
	LRule rule = new A_BC();
	char expectedMatch = 'A';
	char[] expectedBody = {'B','C'};

	@Test
	public void testGetMatch() {
		assertEquals("Expected match " + expectedMatch, expectedMatch, rule.getMatch());
	}
	
	@Test
	public void testGetBody() {
		assertArrayEquals("Body did not match", expectedBody, rule.getBody());
	}
	
}
