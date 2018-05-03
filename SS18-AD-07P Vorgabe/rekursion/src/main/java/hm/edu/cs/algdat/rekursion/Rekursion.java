package hm.edu.cs.algdat.rekursion;

public class Rekursion {

	/**
	 * Testet, ob ein String ein Palindrom ist (case-insensitiv), iterative
	 * Variante.
	 * 
	 * @param string
	 * @return true if Palindrome, false else
	 */
	static boolean isPalindromeIterative(String string) {
		String temp = string.toUpperCase();
		if (temp.length() == 0) return true;
		for (int i = 0; i <= (temp.length() / 2); i++) {
			if (temp.charAt(i) != temp.charAt(temp.length() - 1 - i)) return false;
		}
		return true;
	}

	/**
	 * Testet, ob ein String ein Palindrom ist (case-insensitiv), rekursive
	 * Variante.
	 * 
	 * @param string
	 * @return true if Palindrome, false else
	 */
	static boolean isPalindromeRecursive(String string) {
		return isPalindromeRecursive(string, 0, string.length() - 1);
	}

	private static boolean isPalindromeRecursive(String string, int von, int bis) {
		String temp = string.toUpperCase();
		if (von >= bis) return true;
		if (temp.charAt(von) == temp.charAt(bis)) return isPalindromeRecursive(temp, von + 1, bis - 1);
		return false;
	}
}
