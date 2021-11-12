package arrayDiff;

import java.util.ArrayList;

import java.util.List;



/*Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.

Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
*/
/**
 * @author Shiv
 *
 */
public class App {
	
	  public static int[] arrayDiff(int[] a, int[] b) {
		    List<Integer> matchingIntegers = new ArrayList<>();
		
		    for (var i =0; i<a.length; i++ ) {
		    	for (var j =0; j<b.length; j++) {
		    		if (a[i] == b[j]) { // an element matches!
		    			matchingIntegers.add(a[i]);
		    		}
		    	}
		    }
		    List<Integer> differencedList = new ArrayList<>();
		    
		    //adding numbers into differencedList
		    for (int i1 = 0; i1<a.length; i1++) {
		    	if (!matchingIntegers.contains(a[i1])) {
		    		differencedList.add(a[i1]);
		    	}
		    }
		    
		    //convert differencedList to an array
		    int[] returnedArray = new int[differencedList.size()];
		    
		    for (var j =0;j<differencedList.size();j++) {
		    	returnedArray[j] = differencedList.get(j);
		    }
		    
		    
		    return returnedArray;
		    }
		    
		    
		    
		  
	public static void main(String[] args) {
		for (var j:arrayDiff(new int[] {1, 2 ,3}, new int[] {1})) {
			System.out.println(j);
		}
		

	}

}
