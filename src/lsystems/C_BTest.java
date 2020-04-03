package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class C_BTest {
	LRule rule = new C_B();
	char expectedMatch = 'C';
	char[] expectedBody = {'B'};

	@Test
	public void testGetMatch() {
		assertEquals("Expected match " + expectedMatch, expectedMatch, rule.getMatch());
	}
	
	@Test
	public void testGetBody() {
		assertArrayEquals("Body did not match", expectedBody, rule.getBody());
	}
	
}
