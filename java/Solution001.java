
public class Solution001 {
	
	public static void main(String[] args) {
		
		int totalSum = 0;
		
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				totalSum += i;
			}
		}
		
		System.out.println(totalSum) ;
		
	}
}
