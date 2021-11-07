package digitalRoot;

public class App {
	
	  public static int digital_root(int n) {
		    String[] splitIntegers = Integer.toString(n).split("");
		    
		    int sum =10;
		    while (sum>9) {
		     sum =0;
			    for (var i =0; i<splitIntegers.length;i++) {
			    	sum += Integer.parseInt(splitIntegers[i]);
			    }
			    if (sum > 9) {
			    	splitIntegers = Integer.toString(sum).split("");
			    	System.out.println(splitIntegers);
			    	continue;
			    }
			    else {
			    	break;
			    }
		    }
		    
		    return sum;
		  }

	public static void main(String[] args) {
		System.out.println(digital_root(942));
	}

}
