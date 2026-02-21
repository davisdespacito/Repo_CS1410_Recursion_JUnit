package recursion;

public class Recursion {

	/**
	 * takes input <code>n</code> and sums the digits.
	 * 
	 * @param n
	 * @return sum of all the digits provided.
	 */
	public static int sumOfDigits(int n) {

		if (n == 0) {

			return 0;

		}

		if (String.valueOf(n).length() <= 1) {

			return n;

		}

		if (String.valueOf(n).charAt(0) == '-') {

			return sumOfDigits(Integer.parseInt(String.valueOf(n).substring(1)));

		}

		return Integer.parseInt(String.valueOf(n).substring(0, 1))
				+ sumOfDigits(Integer.parseInt(String.valueOf(n).substring(1)));

	}

	/**
	 * returns input string <code>str</code> as uppercase.
	 * 
	 * @param str
	 * @return
	 */
	public static String toUpper(String str) {

		// TODO

		if (str.length() <= 1) {

			return str.toUpperCase();

		}

		return Character.toUpperCase(str.charAt(0)) + " " + toUpper(str.substring(1));
	}

	public static double harmonic(int n) {
		if (n == 0)
			throw new IllegalArgumentException("The argument n can't be zero.");

		if (n == 1)
			return 1;
		else if (n < 0)
			return -1 * harmonic(-n);
		else // n > 1
			return 1.0 / n + harmonic(n - 1);
	}

}
