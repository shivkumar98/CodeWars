package CreatePhoneNumber;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class app {
	  public static String createPhoneNumber(int[] numbers) {
	
		  String numberString = IntStream.of(numbers)
                  .mapToObj(String::valueOf)
                  .collect(Collectors.joining(""));

		  System.out.println(numberString);
		    StringBuffer sb = new StringBuffer();
		    	   
		 
		    sb.append("(");
		    sb.append(numberString.substring(0, 3));
		    sb.append(")");
		    sb.append(" ");
		    sb.append(numberString.substring(3, 6));
		    sb.append("-");
		    sb.append(numberString.substring(6,10 ));
		    return sb.toString();
		  }

	public static void main(String[] args) {
		int[] number = {1,2,3,4,5,6,7,8,9,0};
		System.out.println(createPhoneNumber(number));

	}

}
