package com.ce;

import static org.junit.Assert.*;

import org.junit.Test;

public class JtestServletTest {

	@Test
	public void testAdd() {
		assertEquals(2, new JtestServlet().add(1, 1));
	}
	@Test
	public void testAdd2() {
		assertEquals(3, new JtestServlet().add(1, 1));
	}
	@Test
	public void testAdd3() {
		assertEquals(2, new JtestServlet().add(1, 1));
	}
	@Test
	public void testAdd4() {
		assertEquals(3, new JtestServlet().add(1, 1));
	}
	@Test
	public void testAdd5() {
		assertEquals(3, new JtestServlet().add(1, 1));
	}
	@Test
	public void testAdd6() {
		assertEquals(2, new JtestServlet().add(1, 1));
	}
	

}
