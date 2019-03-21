package com.ce;

import static org.junit.Assert.*;

import org.junit.Test;

public class JtestServletTest {

	@Test
	public void testAdd() {
		assertEquals(3, new JtestServlet().add(1, 1));
	}

}
