package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		assertEquals(1, 1);
		assertTrue(true);
		assertFalse(false);
		assertNotNull(getClass());
		assertNull(getClass());
//		assertArrayEquals(null, null);
	}

}
