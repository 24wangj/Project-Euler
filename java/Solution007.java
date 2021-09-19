
public class Solution007 {

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		int prime = 0;
		int counter = 0;
		
		for (int i = 1; counter <= 10001; i++) {
			if (isPrime(i)) {
				prime = i;
				counter++;
			}
		}
		
		System.out.println(prime);
		
	}
}
