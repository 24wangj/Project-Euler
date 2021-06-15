
public class Solution005 {

	public static void main(String[] args) {
		
		int num = 0;
		boolean isMultiple = false;
		
		for (int i = 0; isMultiple != true; i++) {
			if (i > 0 &&
				i % 11 == 0 &&
				i % 12 == 0 &&
				i % 13 == 0 &&
				i % 14 == 0 &&
				i % 15 == 0 &&
				i % 16 == 0 &&
				i % 17 == 0 &&
				i % 18 == 0 &&
				i % 19 == 0 &&
				i % 20 == 0) {
				
				num = i;
				isMultiple = true;
			}
		}
		
		System.out.println(num);
		
	}
}
