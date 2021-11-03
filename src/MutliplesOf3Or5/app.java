package MutliplesOf3Or5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
 * If we list all the natural numbers below 10 that are
 *  multiples of 3 or 5, we get 3, 5, 6 and 9.
 *   The sum of these multiples is 23.

Finish the solution so that it returns the sum of all
the multiples of 3 or 5 below the number passed in.
 Additionally, if the number is negative, return 0 (for languages that do have them).
 */

public class app {
	
	public static int Solution(int number) {
		List<Integer> multiples = findMultiplesOf3and5Below(number);
		int sum = 0;
		for (var i=0;i<multiples.size();i++) {
			sum = sum+multiples.get(i);
		}
		return sum;
		
	}

	private static List<Integer> findMultiplesOf3and5Below(int number) {
		List<Integer> multiplesOf3and5 = new ArrayList<>();
		for (var i =5; i<number;i=i+5) {
			if (!multiplesOf3and5.contains(i)) {
				multiplesOf3and5.add(i);
				System.out.println(i);
			}
				
		}
		for (var i =3; i<number;i=i+3) {
			if (!multiplesOf3and5.contains(i)) {
				multiplesOf3and5.add(i);
				System.out.println(i);
			}
			
		}
		
		return multiplesOf3and5;
		
		
	}



	public static void main(String[] args) {
		System.out.println(Solution(10));
		

	}

}
