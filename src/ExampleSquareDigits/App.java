package ExampleSquareDigits;

public class App {

	  public static int squareDigits(int n) {
		  char[] chars=Integer.toString(n).toCharArray();
		  StringBuffer sb = new StringBuffer();
		  for ( char c : chars) {
			 int digit=Character.getNumericValue(c);
			 sb.append(digit*digit);
		
		  }
		  
		  return Integer.parseInt(sb.toString());
		   
		  }
	public static void main(String[] args) {
		System.out.println( squareDigits(12345));

	}

}
