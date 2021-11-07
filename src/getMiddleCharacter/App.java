package getMiddleCharacter;

public class App {
	
	public static String getMiddle(String word) {
	    String[] splitString = word.split("");
	    String middleCharacter = "";
	    int length= splitString.length;
	    
	    if (length%2 == 0) {
	    	middleCharacter += splitString[(length/2)-1];
	    	middleCharacter += splitString[(length/2)];
	    } else {
	    	middleCharacter += splitString[length/2];
	    }
	    
	    return middleCharacter;
	  }

	public static void main(String[] args) {
		System.out.println(getMiddle("hell"));
		System.out.println(getMiddle("hello"));

	}

}
