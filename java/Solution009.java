
public class Solution009 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		for (int i = 1; i <= 997; i++) {
			for (int j = 1; j < i; j++) {
				for (int k = 1; k < i + j; k++) {
					if (i * i + j * j == k * k && i + j + k == 1000) {
						a = i;
						b = j;
						c = k;
					}
				}
			}
		}
		System.out.println(a * b * c);
	}
}
