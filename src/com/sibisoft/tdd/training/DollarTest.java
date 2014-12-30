package com.sibisoft.tdd.training;

import static org.junit.Assert.*;

import org.junit.Test;

public class DollarTest {

	@Test
	public void SampleTest() {
		assertEquals(5, new Dollar(5).amount);
	}

}
