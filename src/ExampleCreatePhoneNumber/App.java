package ExampleCreatePhoneNumber;

public class App {
	
	public static String createPhoneNumber(int[] numbers) {
		String phoneNumber = "";
		
		for (var i =0; i<numbers.length; i++) {
			if (i ==0 ) {
				phoneNumber += "(";
			}
			if (i ==3 ) {
				phoneNumber += ") ";
			}
			if (i==6) {
				phoneNumber += "-";
			}
			phoneNumber += Integer.toString(numbers[i]);
			
		}
		
		return phoneNumber;
	}

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		System.out.println(createPhoneNumber(numbers));

	}

}
