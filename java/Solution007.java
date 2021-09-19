
public class Solution007 {

	public boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Solution007 tester = new Solution007();
		
		int counter = 0;
		int prime = 0;
		
		for (int i = 1; counter <= 10001; i++) {
			if (tester.isPrime(i) == true) {
				prime = i;
				counter++;
			}
		}
		
		System.out.println(prime);
		
	}
}
