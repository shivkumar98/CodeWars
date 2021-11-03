package VowelCount;

public class app {
	
	 public static int getCount(String str) {
		 int vowelsCount = 0;
		String[] sub =str.split("");
	  int sum = 0;
		for (var j =0;j<sub.length;j++) {
	
			if (sub[j].contains("a") || sub[j].contains("e") ||sub[j].contains("i")||sub[j].contains("o")||sub[j].contains("u"))
					{
      sum = sum + 1;
    }
		}
		return	sum;
	 }
	 
	 public static void main(String[] args) {
		 
		 
		 System.out.println(getCount("hdsafo;bnaed"));
		
		
	}

}
