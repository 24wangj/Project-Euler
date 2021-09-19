
public class Solution003 {

	public static void main(String[] args) {
		
		long num = 600851475143l;
		
		for (long i = 2; i < num; i++) {
			while (num % i == 0) {
				num /= i;
			}
		}
		
		System.out.println(num);
		
	}
}
