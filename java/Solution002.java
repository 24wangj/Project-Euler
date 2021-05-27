
public class Solution002 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		int numSum = 0;
		int totalSum = 0;
		
		while (numSum <= 4000000) {
			numSum = num1 + num2;
			num1 = num2;
			num2 = numSum;
			
			if (numSum % 2 == 0) {
				totalSum += numSum;
			}
		}
		
		System.out.println(totalSum);
		
	}
}
