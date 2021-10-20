package area;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void test() {
		Circle cTest = new Circle(5.2);
		assertEquals(84.949, cTest.getArea(),0.001);
	}
}
