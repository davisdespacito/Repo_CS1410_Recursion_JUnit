package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class HarmonicTest {

	private static final double DELTA = 1e-9;

	@Test
	void harmonic_inputOf3() {

		assertEquals(11.0 / 6.0, Recursion.harmonic(3), DELTA);
		System.err.printf("Expected Result: %f %nActual Result: %f%n%n", 11.0 / 6.0, Recursion.harmonic(3));

	}

	@Test
	void harmonic_inputOfNegative2() {

		assertEquals(-3.0 / 2.0, Recursion.harmonic(-2), DELTA);
		System.err.printf("Expected Result: %f %nActual Result: %f%n%n", -3.0 / 2.0, Recursion.harmonic(-2));

	}

	@Test
	void harmonic_inputOfZero_ThrowsIllegalArgumentException() {

		assertThrows(IllegalArgumentException.class, () -> {
			Recursion.harmonic(0);
		});

	}

}
