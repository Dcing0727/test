package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Main main = new Main();
		int result = main.add(1, 1);
		int result2 = main.add(	3,4);
		assertEquals(2, result);
		assertEquals(7, result2);

	}

}
