package area;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void test() {
		Rectangle rTest = new Rectangle(3.0,4.0);
		assertEquals(12.000, rTest.getArea(),0.001);
	}

}
