package disemvowelTroll;

public class App {
	 public static String disemvowel(String str) {
	      str.replace("a",  "");
	        System.out.println( str.replaceAll("[aeriou]",  ""));
			return str.replaceAll("[aeiouAEIOU]",  "");
	    }
	public static void main(String[] args) {
		disemvowel("hi i am a trollol");
	}

}
