//This is not gonna work

public class HelloWorld {

	//method return
	static String fullName(String name1, String name2) {
		return name1 + " " + name2;
	}
	
	public static void main(String[] args) {
		
		//hello world!
		System.out.println("Hello World!".toUpperCase());

		//dumb decimals
		double x = 4.02;
		double y = 0.01;
		double z = x + y;
		System.out.println(z);

		//double to int
		double testDouble = 69;
		int testInt = (int) testDouble;
		System.out.println(testInt);

		//int to double
		int anotherInt = 420;
		double anotherDouble = anotherInt;
		System.out.println(anotherDouble);

		//array loop
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		int i = 0;
		while (i < cars.length) {
			System.out.println(cars[i]);
			i++;
		}
		
		//method parameters
		String actor = fullName("Ryan", "Reynolds");
		System.out.println(actor);
	}
}
