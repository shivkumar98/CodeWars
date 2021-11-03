package DescOrderProblem;

import java.util.Arrays;
import java.util.Collections;

public class main {
	  public static int sortDesc(final int num) {
		    String string = String.valueOf(num);
		    String[] splitString = string.split("");
		    StringBuffer sb = new StringBuffer();
		   
		    
		    int[] nums = new int[splitString.length];
		    
		    for ( var i = 0; i<splitString.length; i++) {
		    	nums[i] = Integer.parseInt(splitString[i]);
		    }
		    Arrays.sort(nums);

		    String string1 = Arrays.toString(nums);
		
		    
		    for (var k =0;k<nums.length;k++)
		    {
		    	sb.append(nums[nums.length-k-1]);
		    }
		    
		    int myInt =Integer.valueOf(sb.toString());
		    return myInt;
			
		    
		  }

	  public static void main(String[] args) {
		  
		  System.out.println(sortDesc(1021));
		   
		
	}

}
