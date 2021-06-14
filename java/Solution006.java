
public class Solution006 {

	public static void main(String[] args) {
		
		int sum = 0;
		int squareSum = 0;
		int result;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		sum *= sum;
		
		for (int k = 1; k <= 100; k++) {
			squareSum += k * k;
		}
		
		result = sum - squareSum;

		System.out.println(result);
		
	}
}
