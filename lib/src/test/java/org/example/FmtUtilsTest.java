package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FmtUtilsTest {

	@Test
	void parseCurrencyToNumberWhenInputIsNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			FmtUtils.parseCurrencyToNumber(null);
		});
	}

	@Test
	void parseCurrencyToNumberWhenInputIsEmpty() {
		assertThrows(InvalidAmountException.class, () -> {
			FmtUtils.parseCurrencyToNumber("");
		});
	}

	@Test
	void parseCurrencyToNumberWhenInputIsValid() {
		String input = "$500.75";
		String expectedOutput = "500.75";

		String actualOutput = FmtUtils.parseCurrencyToNumber(input);

		assertEquals(expectedOutput, actualOutput);
	}
}
