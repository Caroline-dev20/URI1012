package area;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void test() {
		Square sTest = new Square(4.0);
		assertEquals(16.000, sTest.getAreaSquare(),0.001);
	}

}
