package FindOdd;

import java.util.ArrayList;
import java.util.List;

public class app {
	
	public static int findIt(int[] a) {
		List<Integer> digits = new ArrayList<Integer>();
		
		for (var i =0;i<a.length;i++) {
			if (!digits.contains(a[i])) {
				digits.add(a[i]); // adds instances sequentially
			}
		}
		
		List<Integer> instanceCount = new ArrayList<>();
		
		//going to count each instance of each digit
		for (var i=0; i<digits.size();i++) {
			instanceCount.add(0);
			for (var j=0; j< a.length;j++) {
				if ( digits.get(i)==a[j] ) {
					instanceCount.set(i, instanceCount.get(i)+1) ;
				}
			}
		}
		int digitLocation = 0;
		//now to see if an instancecount is odd
		for (var k = 0;k<instanceCount.size();k++) {
			if (instanceCount.get(k)%2==1) {
				digitLocation = k;
				break;
			}
		}
		
		
		//now return digit which has odd occurences:
		return digits.get(digitLocation);
		
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,2,3,3,3,4,3,3,3,2,2,1};
		System.out.println(findIt(a));
	}

}
