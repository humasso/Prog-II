import java.util.Scanner;

public class Lychrel {

	// EFFECTS: Restituisce la stringa invertendo l'ordine dei caratteri in s.
	public static String reversal(String s) {
		if (s.length() <= 1) {
			return s;
		}
		return s.charAt(s.length() - 1) + reversal(s.substring(1, s.length() - 1)) + s.charAt(0);
	}

	// EFFECTS: Restituisce true se s è palindroma
	public static boolean isPalindrome(String s) {
		//System.out.println(s+"----"+reversal(s));
		long a = stringToNum(s);
		long b = stringToNum(reversal(s));
		if (a==b){
			return true;
		}
		return false;
	}
	
		
	// EFFECTS: REstituisce una stringa contenente la rappresentazione di n
	public static String numToString(long n) {
		return "" + n;
	}

	// REQUIRES: s deve contenere solo caratteri numerici
	// EFFECTS: REstituisce una stringa contenente la rappresentazione di n
	public static long stringToNum(String s) {
		long n = 0;
		for (int i = 0; i < s.length(); i++) {
			n *= 10;
			n += s.charAt(i) - '0';
		}
		return n;
	}

	// REQUIRES: n dev'essere positivo e non dev'essere un numero di Lychrel
	// MODIFIES: System.out
	// EFFECTS: Stampa su system.out la sequenza di Lychrel a partire da n
	public static void printLychrelSequence(long n) {
		while (!isPalindrome(numToString(n))){
			System.out.println(n);
			n+=stringToNum(reversal(numToString(n)));
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Integer num = s.nextInt();
		s.close();
		System.out.println("________________________");
		printLychrelSequence(num);
		//System.out.println(isPalindrome("1111"));

		/*
		 * System.out.println(num);
		 * System.out.println("//////////////");
		 * String l = numToString(num);
		 * System.out.println(l);
		 * System.out.println("//////////////");
		 * long p = stringToNum(l);
		 * System.out.println(p);
		 * System.out.println("//////////////");
		 * System.out.println(reversal(l));
		 * System.out.println("//////////////");
		 * System.out.println(isPalindrome(l));
		 */
	}
}