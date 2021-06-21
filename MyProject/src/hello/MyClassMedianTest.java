package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassMedianTest {

	@Test
	public void Test1() {
		assertEquals(MyClass.median(1, 2, 3), 2);
	}

	@Test
	public void Test2() {
		assertEquals(MyClass.median(1, 3, 2), 2);
	}

	@Test
	public void Test3() {
		assertEquals(MyClass.median(2, 3, 1), 2);
	}

	@Test
	public void Test4() {
		assertEquals(MyClass.median(2, 1, 3), 2);
	}
	
	@Test
	public void Test5() {
		assertEquals(MyClass.median(3, 1, 2), 2);
	}
	
	@Test
	public void Test6() {
		assertEquals(MyClass.median(3, 2, 1), 2);
	}

}
