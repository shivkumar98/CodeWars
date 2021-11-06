package squareEveryDigit;


import java.util.ArrayList;

public class App {
	
	public static int squareDigits(int n) {
		String[] splitString = Integer.toString(n).split("");
		
		
		ArrayList<Integer> numberArray = new ArrayList<>();
		
		for (var i =0; i<splitString.length;i++) {
			numberArray.add(Integer.parseInt(splitString[i]));
			
		}
		
		//squaring integers:
		for (var i = 0; i <splitString.length; i++ ) {
			numberArray.set(i, numberArray.get(i)*numberArray.get(i));
		}
		
		String squaredDigits = new String();
		for (var i = 0; i <numberArray.size();i++ ) {
			squaredDigits += String.valueOf(numberArray.get(i));
		
		}
		

		return Integer.parseInt(squaredDigits);
	    
	  }

	public static void main(String[] args) {
		
		squareDigits(1234);
		
	}

}
