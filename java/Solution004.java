
public class Solution004 {

	public static void main(String[] args) {
		
		int product = 0, result = 0;
		
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				product = i * j;
				
				String str = String.valueOf(product);
				StringBuilder input = new StringBuilder();
				input.append(str);
				input.reverse();
				
				if (str.equals(input.toString()) && product > result) {
					result = product;
				}
			}
		}
		
		System.out.println(result);
		
	}
}
