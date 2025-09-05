/**
 * 
 */
package org.example;

/**
 * 
 */
public class FmtUtils {
	
	/**
	 * Parses a string containing a currency amount into a numeric string.
	 * <p>
	 * This method strips common currency symbols (e.g. $) and 
	 * thousands separators (,) and returns a clean string of digits.
	 * 
	 * @param formattedAmount The currency string to parse, e.g., 
	 * "$1,250.50".
	 * 
	 * @return A string containing only the numeric value, e.g., "1250.50".
	 * @throws IllegalArgumentException if the input string is null.
	 * 
	 */
	public static String parseCurrencyToNumber(String formattedAmount) {
		if(formattedAmount == null)
			throw new IllegalArgumentException("Formatted amount cannot be null.");
		else if(formattedAmount.isEmpty())
			throw new InvalidAmountException("Amount cannot be empty.");
		else {
			String cleanedString = formattedAmount.replaceAll("[^\\d.]", "");
			return cleanedString;
		}
		
	}
}
