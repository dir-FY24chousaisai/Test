package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
		assertEquals(5, calculator.add(2, 3));
	}

	@Test
	void testSubtract() {
		Calculator caculator = new Calculator();
		assertEquals(-1, caculator.subtract(2, 3));
	}

}
