package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassOtherTest {

	@Test
	public void testLarger1() {
		assertEquals(MyClass.larger(1, 2), 2);
	}

	@Test
	public void testLarger2() {
		assertEquals(MyClass.larger(2, 1), 2);
	}

	@Test
	public void testAbsPositive() {
		assertEquals(MyClass.abs(1), 1);
	}

	@Test
	public void testAbsZero() {
		assertEquals(MyClass.abs(0), 0);
	}

	@Test
	public void testAbsNegative() {
		assertEquals(MyClass.abs(-1), 1);
	}

}
