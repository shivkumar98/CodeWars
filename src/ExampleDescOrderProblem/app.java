package ExampleDescOrderProblem;

import java.util.Arrays;
import java.util.Collections;

public class app {
	
	public static int DescOrder(final int num) {
		String string = String.valueOf(num);
		String[] stringSplit = string.split("");
		Arrays.sort(stringSplit, Collections.reverseOrder());
		return Integer.valueOf(String.join("", stringSplit));
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(DescOrder(1234));
		System.out.println(DescOrder(949389));
		
	

	}

}
