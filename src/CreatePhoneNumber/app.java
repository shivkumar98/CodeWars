package CreatePhoneNumber;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// convert integer array into phone number style string
// e.g. {1,2,3,4,5,6,7,8,9,0} becomes "(123) 456-7890

public class app {
	  public static String createPhoneNumber(int[] numbers) {
		  
		  StringBuffer sb = new StringBuffer();
		  
		  sb.append("(");
		  
		  for (var i =0; i<3;i++) {
			  sb.append(String.valueOf(numbers[i]));
		  }
		  
		  sb.append(") ");
		  
		  for (var i =3; i<6;i++) {
			  sb.append(String.valueOf(numbers[i]));
		  }
		  
		  sb.append("-");
		  
		  for (var i =6; i<10;i++) {
			  sb.append(String.valueOf(numbers[i]));
		  }
		 
		  return sb.toString();
		  
		  }

	public static void main(String[] args) {
		int[] number = {1,2,3,4,5,6,7,8,9,0};
		System.out.println(createPhoneNumber(number));

	}

}
