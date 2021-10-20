package area;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrapeziumTest {

	@Test
	void test() {
		Trapezium trapTest = new Trapezium(3.0,4.0,5.2);
		assertEquals(18.200, trapTest.getArea(),0.001);
	}

}
