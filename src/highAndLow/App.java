package highAndLow;

public class App {

	// highAndLow("1 2 3 4 5")  // return "5 1"
	// highAndLow("1 2 -3 4 5") // return "5 -3"
	// highAndLow("1 9 3 4 -5") // return "9 -5"
	  public static String highAndLow(String numbers) {
		    
		  String[] string = numbers.split(" ");
		  int[] integers = new int[string.length];
		  for (var i = 0; i <string.length; i++ ) {
			  if (!string[i].isBlank() ) {
					 integers[i] = Integer.parseInt(string[i]);
			  }
		
			 
			  
		
			  System.out.println(integers[i]);
		  }
		  
		  int largest = -9999;
		  int smallest = 9999;
		  System.out.println(smallest);
		  
		  for (var i = 0; i <integers.length; i ++) {
			  largest = Math.max(largest, integers[i]);
			  System.out.println(integers.length);
			  smallest = Math.min(smallest, integers[i]);
		  }
		  
		    return Integer.toString(largest) + " " + Integer.toString(smallest);
	  }

	public static void main(String[] args) {
		System.out.println(highAndLow("1 2 3 4 5"));

	}

}
