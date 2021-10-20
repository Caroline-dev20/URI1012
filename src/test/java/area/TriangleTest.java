package area;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void test() {
		Triangle tTest = new Triangle(3.0,5.2);
		assertEquals(7.800, tTest.getArea(),0.001);
	}

}
