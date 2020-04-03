package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class B_ATest {
	LRule rule = new B_A();
	char expectedMatch = 'B';
	char[] expectedBody = {'A'};

	@Test
	public void testGetMatch() {
		assertEquals("Expected match " + expectedMatch, expectedMatch, rule.getMatch());
	}
	
	@Test
	public void testGetBody() {
		assertArrayEquals("Body did not match", expectedBody, rule.getBody());
	}
	
}
