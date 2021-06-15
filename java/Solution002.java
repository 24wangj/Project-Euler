
public class Solution002 {

	public static void main(String[] args) {
		
		int num1 = 0, num2 = 1, sum = 0, result = 0;
		
		while (sum <= 4000000) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			
			if (sum % 2 == 0) {
				result += sum;
			}
		}
		
		System.out.println(result);
		
	}
}
