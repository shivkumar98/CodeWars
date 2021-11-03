package ExampleMultiplesOf3Or5;

public class app {
	
	public static int Solution(int number) {
		int sum = 0;
		for (var i=1; i<number; i++) {
			if (i%3==0 || i%5==0) {
				sum = sum + i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Solution(10));
		
	}

}
